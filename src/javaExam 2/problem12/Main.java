package javaExam.problem12;

import java.util.Scanner;

// ===== 학교 노트북 대여 관리 (싱글톤 패턴) =====

// 노트북 클래스
class Notebook {
    private int totalCount;    // 전체 노트북 수
    private int rentalCount;   // 대여 중인 노트북 수

    // 생성자: 전체 5대, 대여 중 0대로 초기화
    Notebook() {
        this.totalCount = 5;
        this.rentalCount = 0;
    }

    // 대여: 0보다 크고, 남은 노트북 수(전체 - 대여 중) 이하일 때만 가능
    void rentNotebook(int count) {
        if (count > 0 && count <= totalCount - rentalCount) {
            rentalCount += count;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    // 반납: 0보다 크고, 현재 대여 중인 수 이하일 때만 가능
    void returnNotebook(int count) {
        if (count > 0 && count <= rentalCount) {
            rentalCount -= count;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    // 전체 / 대여 중 / 남은 노트북 수 출력
    void showInfo() {
        System.out.println("전체 노트북: " + totalCount + "대");
        System.out.println("대여 중: " + rentalCount + "대");
        System.out.println("남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}

// 노트북 대여 관리 클래스 (싱글톤: 객체가 프로그램 전체에서 딱 하나만 존재)
class NotebookManager {
    // 1) 유일한 객체를 클래스 로딩 시점에 미리 하나 만들어 둔다 (static)
    private static NotebookManager instance = new NotebookManager();

    // 관리할 노트북 객체
    private Notebook notebook;

    // 2) 생성자를 private으로 막아서 외부에서 new로 만들지 못하게 한다
    private NotebookManager() {
        notebook = new Notebook();   // 생성자 안에서 Notebook 객체 생성
    }

    // 3) 유일한 객체를 돌려주는 static 메서드 (외부에서는 이것으로만 접근)
    static NotebookManager getInstance() {
        return instance;
    }

    // 대여: Notebook 객체의 대여 메서드를 호출
    void rentNotebook(int count) {
        notebook.rentNotebook(count);
    }

    // 반납: Notebook 객체의 반납 메서드를 호출
    void returnNotebook(int count) {
        notebook.returnNotebook(count);
    }

    // 대여 현황 출력
    void showInfo() {
        System.out.println("==노트북 대여 현황==");
        notebook.showInfo();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // new가 아니라 getInstance()로 관리 객체를 가져온다
        NotebookManager manager = NotebookManager.getInstance();

        // 대여할 수량, 반납할 수량을 차례대로 입력받는다
        int rentCount = sc.nextInt();
        int returnCount = sc.nextInt();

        manager.rentNotebook(rentCount);       // 먼저 대여
        manager.returnNotebook(returnCount);   // 그 다음 반납
        manager.showInfo();                    // 최종 현황 출력
    }
}

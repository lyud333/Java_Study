package javaExam2.problem12;

import java.util.Scanner;

// ===== 학교 노트북 대여 관리 (싱글톤 패턴) =====

// 노트북 클래스
class Notebook {
    private int totalCount;
    private int rentalCount;

    Notebook(){
        this.totalCount=5;
        this.rentalCount=0;
    }
    void rentNotebook(int count){
        if (count > 0 && count<=totalCount-rentalCount){
            rentalCount+=count;
        }else{
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }
    void returnNotebook(int count){
        if (count > 0 && count<=rentalCount){
            rentalCount-=count;
        } else{
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }
    void showInfo(){
        System.out.println("==노트북 대여 현황==");
        System.out.println("전체 노트북: "+totalCount+"대");
        System.out.println("대여 중: "+rentalCount+"대");
        System.out.println("남은 노트북: "+(totalCount-rentalCount)+"대");
    }
}

// 노트북 대여 관리 클래스 (싱글톤: 객체가 프로그램 전체에서 딱 하나만 존재)
class NotebookManager {
    private static NotebookManager instance = new NotebookManager();
    private Notebook notebook;
    private NotebookManager(){
        notebook= new Notebook();
    }
    static NotebookManager getInstance(){
        return instance;
    }
    void rentNotebook(int count){
        notebook.rentNotebook(count);
    }
    void returnNotebook(int count){
        notebook.returnNotebook(count);
    }
    void showInfo(){
        notebook.showInfo();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager manager = NotebookManager.getInstance();
        int rentc = sc.nextInt();
        int returnc = sc.nextInt();

        manager.rentNotebook(rentc);
        manager.returnNotebook(returnc);
        manager.showInfo();

    }
}

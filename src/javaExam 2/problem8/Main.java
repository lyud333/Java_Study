package javaExam.problem8;

import java.util.Scanner;

// ===== 직사각형 넓이와 둘레 계산 =====
class Rectangle {
    // 멤버 변수: private → 같은 클래스 안에서만 접근 가능 (캡슐화)
    private int width;   // 가로
    private int height;  // 세로

    // 생성자: 객체를 만들 때 가로, 세로 값을 받아 멤버 변수를 초기화한다
    Rectangle(int width, int height) {
        this.width = width;    // this.width = 멤버 변수, width = 매개변수
        this.height = height;
    }

    // 넓이 = 가로 × 세로
    int getArea() {
        return width * height;
    }

    // 둘레 = (가로 + 세로) × 2
    int getRerimeter() {       // 문제에서 지정한 메서드 이름(Rerimeter) 그대로 사용
        return (width + height) * 2;
    }

    // 직사각형 정보 출력
    void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + getArea());       // 위에서 만든 메서드 재사용
        System.out.println("둘레: " + getRerimeter());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가로, 세로를 차례로 입력받는다
        int width = sc.nextInt();
        int height = sc.nextInt();

        // 입력값으로 객체 생성 후 정보 출력
        Rectangle rect = new Rectangle(width, height);
        rect.showInfo();
    }
}

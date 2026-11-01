package javaExam.problem10;

import java.util.Scanner;

// ===== 영화관 좌석 예약 =====

// 관람객 클래스
class Customer {
    private String name;          // 관람객 이름
    private int reservedSeats;    // 예약 좌석 수

    // 생성자: 이름을 받아 초기화하고, 예약 좌석 수는 0으로 설정
    Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    // 전달받은 좌석 수를 현재 예약 좌석 수에 더한다
    void addReservation(int seats) {
        reservedSeats += seats;
    }

    // 관람객 이름과 예약 좌석 수 출력
    void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}

// 영화관 클래스
class Cinema {
    private String title;          // 영화 제목
    private int availableSeats;    // 남은 좌석 수

    // 생성자: 영화 제목과 남은 좌석 수 초기화
    Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    // 좌석 예약: 관람객 객체와 예약할 좌석 수를 받는다
    void reserve(Customer customer, int count) {
        if (count <= 0) {
            // 0 이하의 잘못된 값
            System.out.println("올바른 좌석 수를 입력하세요.");
        } else if (count > availableSeats) {
            // 남은 좌석보다 많이 요청한 경우
            System.out.println("예약 가능한 좌석이 부족합니다.");
        } else {
            // 정상 예약: 영화관 좌석은 줄이고, 관람객의 예약 좌석은 늘린다
            availableSeats -= count;
            customer.addReservation(count);   // 관람객 객체의 메서드 호출
        }
    }

    // 영화 제목과 남은 좌석 수 출력
    void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석: " + availableSeats + "석");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 영화관(어벤져스, 10석)과 관람객 2명 생성
        Cinema cinema = new Cinema("어벤져스", 10);
        Customer hong = new Customer("홍길동");
        Customer kim = new Customer("김철수");

        // 두 관람객의 예약 좌석 수를 차례대로 입력받는다
        int hongSeats = sc.nextInt();
        int kimSeats = sc.nextInt();

        // 홍길동 → 김철수 순서로 예약
        cinema.reserve(hong, hongSeats);
        cinema.reserve(kim, kimSeats);

        // 결과 출력
        System.out.println("==예약 결과==");
        hong.showInfo();
        kim.showInfo();
        cinema.showInfo();
    }
}

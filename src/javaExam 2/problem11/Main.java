package javaExam.problem11;

import java.util.ArrayList;
import java.util.Scanner;

// ===== 차량 렌트 =====
class Car {
    // static 변수: 모든 Car 객체가 공유한다. 관리번호용 시리얼 넘버, 101부터 시작
    private static int serialNum = 101;

    private int num;            // 관리번호
    private String carNumber;   // 차량번호
    private String carType;     // 차종
    private int dailyPrice;     // 1일 대여 요금
    private boolean rented;     // 대여 여부 (처음엔 false)

    // 생성자: 차량번호, 차종, 1일 요금을 초기화
    Car(String carNumber, String carType, int dailyPrice) {
        this.num = serialNum;   // 현재 시리얼 넘버를 관리번호로 사용
        serialNum++;            // 다음 차량을 위해 1 증가 (101 → 102 → 103)
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        this.rented = false;
    }

    // 대여: 대여 상태를 true로 바꾸고 총 대여 비용(1일 요금 × 일수)을 반환
    int rent(int days) {
        rented = true;
        return dailyPrice * days;
    }

    // 차량 정보 출력 (마지막에 빈 줄 한 줄)
    void showInfo() {
        System.out.println("관리번호: " + num);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice);
        System.out.println("대여 상태: " + rented);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;   // 총 대여 금액

        // ArrayList에 차량 3대 등록
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int choice = sc.nextInt();   // 대여할 차량 번호 (1~3)
        int days = sc.nextInt();     // 대여 일수

        if (choice > 3) {
            // 3보다 큰 차량 번호를 입력하면 잘못된 입력
            System.out.println("잘못된 입력입니다.");
        } else {
            // 차량 번호는 1부터, 리스트 인덱스는 0부터 시작하므로 choice - 1
            totalPrice = cars.get(choice - 1).rent(days);
        }

        // 모든 차량 정보 출력
        for (Car car : cars) {
            car.showInfo();
        }

        // 총 대여 금액 출력 (잘못된 입력이면 0)
        System.out.println("총 대여금액: " + totalPrice);
    }
}

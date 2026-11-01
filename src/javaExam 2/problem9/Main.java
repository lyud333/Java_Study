package javaExam.problem9;

import java.util.Scanner;

// ===== 자판기 음료 판매 =====
class VendingMachine {
    private String name;  // 음료 이름
    private int price;    // 가격
    private int stock;    // 재고 수량

    // 생성자: 음료 이름, 가격, 재고 수량을 초기화
    VendingMachine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 구매할 수량(count)을 받아 판매하는 메서드
    void sell(int count) {
        // 조건: 구매 수량이 0보다 크고, 재고 수량 이하여야 판매 가능
        if (count > 0 && count <= stock) {
            stock -= count;   // 재고에서 구매 수량만큼 차감
        } else {
            // 조건을 만족하지 못하면 재고는 그대로 두고 안내 메시지만 출력
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    // 음료 이름, 가격, 남은 재고 출력
    void showInfo() {
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("남은 재고: " + stock + "개");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 콜라, 1500원, 재고 10개인 자판기 객체 생성
        VendingMachine machine = new VendingMachine("콜라", 1500, 10);

        // 구매할 수량을 정수로 입력받는다
        int count = sc.nextInt();

        // 판매 시도 (실패하면 sell() 안에서 안내 메시지가 먼저 출력됨)
        machine.sell(count);

        // 판매 후 음료 정보 출력
        System.out.println("==판매 후==");
        machine.showInfo();
    }
}

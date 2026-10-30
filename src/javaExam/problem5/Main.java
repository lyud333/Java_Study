package javaExam.problem5;

import java.util.Scanner;

class Product {
    private int pNO;        //상품 번호
    private String pName;   //상품명
    private int price;      //가격
    private int stock;      //재고 수량

    Product(int pNO, String pName, int price, int stock) {
        this.pNO = pNO;
        this.pName = pName;
        this.price = price;
        this.stock = stock;
    }

    int getPrice() {
        return price;
    }

    void reduceStock(int num) {
        this.stock -= num;
    }

    String getName() {
        return pName;
    }

    int getStock() {
        return stock;
    }

    void showInfo() {
        System.out.println("상품 번호: " + pNO);
        System.out.println("상품명: " + pName);
        System.out.println("상품 가격(원): " + price);
        System.out.println("재고 수량: " + stock);
    }
}

class Order {
    private String oName;             //주문자 이름
    static int oNO = 1000;            //주문 번호
    private Product product;          //주문 상품
    private int num;                  //주문 수량

    Order(String oName, Product product, int num) {
        this.oName = oName;
        Order.oNO++;
        this.product = product;
        this.num = num;
    }

    int getTotalPrice() {
        return product.getPrice() * num;
    }

    void processOrder() {
        if (product.getStock() >= num) {
            product.reduceStock(num);
            showInfo();
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    void showInfo() {
        System.out.println("주문자 이름: " + oName);
        System.out.println("주문 번호: " + oNO);
        System.out.println("주문 상품명: " + product.getName());
        System.out.println("주문 수량: " + num);
        System.out.println("주문 금액: " + getTotalPrice() + "원");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product mouse = new Product(101, "마우스", 5000, 100);

        String name = sc.nextLine();
        int num = sc.nextInt();

        Order orderLee = new Order(name, mouse, num);
        System.out.println("==주문 결과==");
        orderLee.processOrder();

        System.out.println("\n==주문 후 상품 정보==");
        mouse.showInfo();
    }
}

package javaExam2.problem9;

import java.util.Scanner;

// ===== 자판기 음료 판매 =====
class VendingMachine {
    private String name;
    private int price;
    private int stock;
    VendingMachine(String name,int price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    void sell(int count){
        if(count<=stock&&count>0){
            stock-=count;
        }else{
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }
    void showInfo(){
        System.out.println("음료 이름: "+name);
        System.out.println("가격: "+price+"원");
        System.out.println("남은 재고: "+stock+"개");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine coke = new VendingMachine("콜라",1500,10);
        int c = sc.nextInt();
        coke.sell(c);
        System.out.println("==판매 후==");
        coke.showInfo();

    }
}

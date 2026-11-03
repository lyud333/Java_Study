package javaExam2.problem11;
import java.util.ArrayList;
import java.util.Scanner;

// ===== 차량 렌트 =====
class Car {
    private static int serialNum=101;
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;

    Car(String carNumber,String carType,int dailyPrice){
        this.num=serialNum;
        serialNum++;
        this.carNumber=carNumber;
        this.carType=carType;
        this.dailyPrice=dailyPrice;
        this.rented=false;
    }
    int rent(int days){
        rented=true;
        return days*dailyPrice;
    }
    void showInfo(){
        System.out.println("관리번호: "+serialNum);
        System.out.println("차량번호: "+carNumber);
        System.out.println("차종: "+carType);
        System.out.println("1일 대여 요금: "+dailyPrice);
        System.out.println("대여 상태: "+rented);
        System.out.println();
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;   // 총 대여 금액
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("234하5678","teslar",100000));
        cars.add(new Car("555허2158","sonata",70000));
        cars.add(new Car("123호4567","genesis",90000));
        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int choice = sc.nextInt();
        int days = sc.nextInt();
        if (choice>3){
            System.out.println("잘못된 입력입니다.");
        }else{
            totalPrice = cars.get(choice -1).rent(days);
        }
        for (Car car:cars){
            car.showInfo();
        }
        System.out.println("총 대여금액: "+totalPrice);

    }
}
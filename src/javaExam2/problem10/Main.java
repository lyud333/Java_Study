package javaExam2.problem10;

import java.util.Scanner;

// ===== 영화관 좌석 예약 =====

// 관람객 클래스
class Customer {
    private String name;
    private int reservedSeat;
    Customer(String name){
        this.name=name;
        this.reservedSeat=0;
    }
    void addReservation(int seat){
        reservedSeat+=seat;
    }
    void showInfo(){
        System.out.println(name+": "+reservedSeat+"석");
    }
}

// 영화관 클래스
class Cinema {
    private String title;
    private int availableSeats;
    Cinema(String title,int availableSeats){
        this.title=title;
        this.availableSeats=availableSeats;
    }
    void reserve(Customer customer,int count){
        if (count<=0){
            System.out.println("올바른 좌석 수를 입력하세요.");
        }else if(availableSeats<count){
            System.out.println("예약 가능한 좌석이 부족합니다.");
        }else{
            availableSeats-=count;
            customer.addReservation(count);
        }
    }
    void showInfo(){
        System.out.println("영화 제목: "+title);
        System.out.println("남은 좌석: "+availableSeats);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema("어벤져스",10);
        Customer hong = new Customer("홍길동");
        Customer kim = new Customer("김철수");

        int seatHong = sc.nextInt();
        int seatKim = sc.nextInt();
        cinema.reserve(hong,seatHong);
        cinema.reserve(kim,seatKim);

        System.out.println("==예약 결과==");
        cinema.showInfo();
        hong.showInfo();
        kim.showInfo();
    }

}

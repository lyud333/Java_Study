package stream.ioTest;

import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {

            System.out.println("차종,색상,가격을 순서대로 입력");
            String model = input.nextLine();
            String color = input.nextLine();
            int price = input.nextInt();
            input.nextLine();

            cars[i] =new Car(model, color, price);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println("보유 차량"+ (i+1));
            cars[i].showCar();
        }
    }
}

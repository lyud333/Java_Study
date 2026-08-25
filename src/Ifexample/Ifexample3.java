package Ifexample;

public class Ifexample3 {
    public static void main(String[] args) {
        int age = 9;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학아동");
        }
        if (age < 14) {
            charge = 2000;
            System.out.println("초등");
        }
        if (age < 20) {
            charge = 2500;
            System.out.println("급식충");
        } else {
            charge = 3000;
            System.out.println("일반인");
        }
        System.out.println("입장료"+charge);
    }
}

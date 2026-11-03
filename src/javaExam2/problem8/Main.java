package javaExam2.problem8;

import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;

    Rectangle(int width,int height) {
        this.width=width;
        this.height=height;
    }
    int getArea(){
        return width*height;
    }
    int getRerimeter(){
        return (width+height)*2;
    }
    void showInfo(){
        System.out.println("가로: "+width);
        System.out.println("세로: "+height);
        System.out.println("넓이: "+getArea());
        System.out.println("둘레: "+getRerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(sc.nextInt(),sc.nextInt());
        rectangle.showInfo();
    }
}

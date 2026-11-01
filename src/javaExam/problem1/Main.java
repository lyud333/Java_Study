package javaExam.problem1;

import java.util.Scanner;
class Rectangle {
    private int width;
    private int height;
    public Rectangle(){
        this.width=width;
        this.height=height;
    }
    int getArea(){
        return width*height;
    }
    int getRerimeter(){
        return (width+height)*2;
    }
    void showinfo(){
        System.out.println("가로: "+width);
        System.out.println("세로: "+height);
        System.out.println("넓이: "+getArea());
        System.out.println("둘레: "+getRerimeter());
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        Rectangle rect = new Rectangle();
        rect.showinfo();

    }
}
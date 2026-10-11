package miugo;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("양의 정수 입력: ");
        int number=sc.nextInt();
        int sum=0;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        System.out.println(sum);
    }
}

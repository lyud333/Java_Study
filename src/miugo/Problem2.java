package miugo;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 정수 입력: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=0;
        if(max>a){
            max=a;
        }
        if(max>b){
            max=b;
        }
        if(max>c){
            max=c;
        }
        System.out.println(max);
    }
}

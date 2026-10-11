package miugo;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 정수 입력: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=a;

        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        int g=b;
        int min=c;
        if (max>g&&g>min) g=b;
        if (min>a) min=a;
        if (min>b) min=b;
        System.out.println(max);
        System.out.println(g);
        System.out.println(min);
    }
}

package stream.others;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름:");
        String name = scanner.nextLine();

        System.out.println("직업:");
        String job = scanner.nextLine();

        System.out.println("사번:");
        String num = scanner.nextLine();

        System.out.println("이름: "+name+"\n직업:"+job+"\n사번:"+num);
    }
}
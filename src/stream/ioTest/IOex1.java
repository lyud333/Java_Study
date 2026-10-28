package stream.ioTest;

import java.util.Scanner;
public class IOex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        for (int i = 0; i < 10; i++) {
            sum+= scanner.nextInt();
        }
        System.out.printf("합: %d 평균: %.1f",sum, (float) sum/10);

    }
}

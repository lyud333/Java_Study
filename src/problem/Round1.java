package problem;

import java.nio.file.SimpleFileVisitor;

public class Round1 {
    public static void main(String[] args) {
        int age = 17;
        int score = 85;

        System.out.println("나이: " + age);
        System.out.println("점수: " + score);
        if (age >= 16 && score >= 80) System.out.println("결과: 통과");
        else                          System.out.println("결과: 미통과");
    }
}

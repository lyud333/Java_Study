package problem;

public class Round8 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) for (int j = i * 5 + 1;j <= i * 5 + 5; j++) System.out.print(j+" ");
            else for (int j = i * 5 + 5;j>= i * 5 + 1; j--) System.out.print(j+" ");
            System.out.println();
        }
    }
}

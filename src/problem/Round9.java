package problem;

public class Round9 {
    public static void main(String[] args) {
        int[] first  = {10, 20, 30, 40, 50};
        int[] second = {60, 70, 80, 90, 100};
        int[] result = new int[5];

        System.arraycopy(first,  1, result, 0, 3);
        System.arraycopy(second, 2, result, 3, 2);
        System.out.print("완성된 배열: ");
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
    }
}

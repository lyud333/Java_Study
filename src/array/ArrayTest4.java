package array;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int num1 = numbers[0][1];
        int num2 =numbers[2][3];

        System.out.println("numbers[0][1] : "+num1+"\nnumbers[2][3] : "+num2);
    }
}

package array;

public class ArrayEx5 {
    public static void main(String[] args) {
        char[][] arr = new char[3][4];

        char alpha = 'A';
        for (int i = 0;i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = alpha;
                System.out.print(arr[i][j] + " ");
                alpha++;
            }
            System.out.println();
        }
    }
}

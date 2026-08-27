package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] arr = new char[10];

        char alpha ='A';

        for (int i = 0; i < 10; i++){
            arr[i] = alpha++;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }


    }
}

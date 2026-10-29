package stream.ioTest;

import java.util.Scanner;

public class IOex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i]=sc.nextInt();
        }//jj
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}

package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = new int[]{89,76,100,68,48,98,56,77,95};
        int sum= 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("합계: "+sum);
        double avg = (double) sum / arr.length;
        System.out.printf("평균: %.1f\n", avg);
    }
}

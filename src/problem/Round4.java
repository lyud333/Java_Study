package problem;

public class Round4 {
    public static void main(String[] args) {
        int sum =0;
        for (int i =10; i<=50;i++){
            if (i % 3== 0 && i % 5 !=0) sum+=i;
        }
        System.out.println("합계: "+sum);
    }
}

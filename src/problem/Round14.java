package problem;

public class Round14 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1;i<=100;i++){
            if (i%3==0) sum+=i;
        }
        System.out.print(sum);
    }
}

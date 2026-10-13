package miugo;

public class Problem6 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <= 50; i++) {
            sum += i +(101 - i);
        }
        System.out.println(sum);
    }
}

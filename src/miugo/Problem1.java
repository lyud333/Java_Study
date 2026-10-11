package miugo;

public class Problem1 {
    public static void main(String[] args) {
        int year = 2020;
        if (year % 400 == 0 || year % 4 == 0&&year%100!=0) {
            System.out.println("윤년");
        }
        else {
                System.out.println("평년");
            }
    }
}
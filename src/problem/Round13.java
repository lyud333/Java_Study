package problem;

public class Round13 {
    public static void main(String[] args) {
        int bookPrice = 12000;
        int money = 20000;

        if (bookPrice>money) {
            System.out.println("책을 구입하지 못했습니다.");
            System.out.println("용돈이 "+(bookPrice-money)+"원 모자랍니다.");
        } else {
            System.out.println("책을 구입했습니다.");
            System.out.println("잔돈이 "+(money-bookPrice)+"원 남았습니다.");
        }
    }
}

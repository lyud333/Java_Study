package Ifexample;

public class ConditionEx7 {
    public static void main(String[] args) {
        int month = 8;
        switch (month){
            case 3,4,5:
                System.out.println("봄");
                break;
            case 6,7,8:
                System.out.println("여름");
                break;
            case 9,10,11:
                System.out.println("가을");
                break;
            case 12,1,2:
                System.out.println("겨울");
                break;
        }
    }
}

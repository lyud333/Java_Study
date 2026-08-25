package Ifexample;

public class ConditionEx1 {
    public static void main(String[] args) {
        int price = 35000;
        int age = 17;
        if (price >= 30000){
            price = price-3000;
        }
        if (age <= 18){
            price = price -2000;

        }
        System.out.println("최종결제 금액: "+price+"원");
    }
}

package Ifexample;

public class ConditionEx4 {
    public static void main(String[] args) {
        int dollar = 50; int exchangeRate = 1400;
        int exan = 0;
        if (dollar <0){
            System.out.println("잘못된금액");
        }else if(dollar==0){
            System.out.println("환전할금액이 없어요");
        }else{
            exan = dollar*exchangeRate;
            System.out.println("환전금액: "+exan+"원");
        }
    }
}

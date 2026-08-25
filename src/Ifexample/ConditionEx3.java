package Ifexample;

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance = 8.5;
        if (distance <= 1){
            System.out.println("걸어");
        }else if(distance <= 10){
            System.out.println("자전거까진 ㅇㅇ");
        }else if(distance<=50){
            System.out.println("차타라;; ㅇㅇ");
        }else{
            System.out.println("기차타세요");
        }
    }
}

package Ifexample;

public class ConditionEx2 {
    public static void main(String[] args) {


        int temp = 23;
        if (temp>=30){
            System.out.println("더워");
        } else if(temp>=20){
            System.out.println("따뜻해");
        } else if(temp>=10){
            System.out.println("쌀쌀");
        }else {
            System.out.println("추워");
        }
    }
}
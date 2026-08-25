package Ifexample;

public class ConditionEx5 {
    public static void main(String[] args) {
        double rating = 8.6;
        if (rating>=9){
            System.out.println("강추");
        }else if(rating>=8){
            System.out.println("추천");
        }else if(rating>=7){
            System.out.println("낫벳");
        }else{
            System.out.println("보면손해");
        }
    }
}

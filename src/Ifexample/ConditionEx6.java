package Ifexample;

public class ConditionEx6 {
    public static void main(String[] args) {
        int score = 84;char grade;String result;
        if (score>=90){
            grade = 'A';
            result = "탁월한 성과";
        }else if (score>=80){
            grade='B';
            result = "좋은 성과";
        }else if (score>=70){
            grade='C';
            result="준수한 성과";
        }else if (score>=60){
            grade='D';
            result="향상해라";
        }else{
            grade='F';
            result="접기좀";
        }
        System.out.println("학점: "+grade);
        System.out.println(result);
    }
}

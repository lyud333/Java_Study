package problem;

public class Round1 {
    public static void main(String[] args) {
        int age = 17;
        int score = 85;
        String result;
        System.out.println("나이: "+age);
        System.out.println("점수: "+score);
        if (age<=16 && score <=80) result = "통과";
        else result = "미통과";
        System.out.println("결과: "+result);
    }
}

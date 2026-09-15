package problem;

public class Round1 {
    public static void main(String[] args) {
        int age = 17;
        int score = 85;
        String R;
        System.out.println("나이: "+age);
        System.out.println("점수: "+score);
        if (age >=16&&score>=80) R = "통과";
        else R ="미통과";
        System.out.println("결과: "+ R);
    }
}

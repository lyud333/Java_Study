package problem;

public class Round2 {
    public static void main(String[] args) {
        int score = 86;
        String grade;
        System.out.println("점수: " + score);
        switch (score / 10){
            case 10: case 9: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
            default: grade = "D";
        }
        System.out.println("등급: "+grade);

    }
}

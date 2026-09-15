package problem;

public class Round2 {
    public static void main(String[] args) {
        int score = 86;
        String G;
        switch (score/10) {
            case 10: case 9: G = "A"; break;
            case 8: G = "B"; break;
            case 7: G = "C";
            default : G = "D";

        }
        System.out.println("점수: "+86);
        System.out.println("등급: "+G);
    }
}

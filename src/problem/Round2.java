package problem;

public class Round2 {
    public static void main(String[] args) {
        int score = 86;

        System.out.println("점수: "+score);
        String g;
        switch (score/10){
            case 10:
            case 9: g="A"; break;
            case 8: g="B"; break;
            case 7: g="C"; break;
            default : g="D";
        }
        System.out.print("등급: "+g);
    }
}

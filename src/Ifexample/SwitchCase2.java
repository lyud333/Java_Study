package Ifexample;

public class SwitchCase2 {
    public static void main(String[] args) {
        String medal = "Gold";
        switch (medal) {
            case "Gold":
                System.out.println("금");
                break;
            case "Selver":
                System.out.println("은");
                break;
            case "Bronze":
                System.out.println("동");
                break;
            default:
                System.out.println("안");

        }
    }
}

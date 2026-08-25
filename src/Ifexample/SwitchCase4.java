package Ifexample;

public class SwitchCase4 {
    public static void main(String[] args) {
        String medal = "Gold";
        String message = switch(medal) {
            case "Gold" -> "금";
            case "Selver" -> "은";
            case "Bronze" -> "동";
            default -> "노메달";
        };
        System.out.println(message);
    }
}

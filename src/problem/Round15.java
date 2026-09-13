package problem;

public class Round15 {
    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};
        char[] code = new char[decode.length];

        for (int i = 0; i < decode.length; i++)
            code[i] = decode[decode.length - 1 - i];

        for (int i = 0; i < code.length; i++) System.out.print(code[i]);
    }
}

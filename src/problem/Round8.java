package problem;

public class Round8 {
    public static void main(String[] args) {
        for (int i=1;i<=20;i+=10){
            for (int j=i;j<=i+4;j++) System.out.print(j+" ");
            System.out.println();
            for (int j=i+9;j>=i+5;j--) System.out.print(j+" ");
            System.out.println();


        }
    }
}

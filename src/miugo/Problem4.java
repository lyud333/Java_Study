package miugo;

public class Problem4 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            int count = 0;
            int n =i;
            while (n >0){
                int d = n %10;
                if (d== 3 ||d==6||d==9){
                    count++;
                }
                n/=10;
            }

            if (count ==0) {
                System.out.print(i);
            } else {
                for (int k =0;k<count;k++){
                    System.out.print("짝");
                }
            }
            System.out.print(" ");
            if (i % 10 == 0) System.out.println();
        }
    }
}

package loop;

public class LoopEx6 {
    public static void main(String[] args) {
        int i =2;
        int j =1;

        for (i=2;i<=9;i++){
            if(i%2==0){
                for(j=1;j<=9;j++){
                    System.out.println(i+" * "+j+" = "+i*j);
                }
            }
        }
    }
}

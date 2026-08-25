package loop;

public class while1 {
    public static void main(String[] args) {
        int i =1;
        int sum = 0;
        while (i<=10){
            sum +=i;
            i++;
        }
        System.out.println("1부터 10까지의 합: "+ sum);
        System.out.println("i값: "+i);
    }
}

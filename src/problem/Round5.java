package problem;

public class Round5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i =0;i<numbers.length;i++){
            if (i % 2 ==0) numbers[i] = (i+1) * 2;
            else numbers[i] = (i+2)*3;
        }
        System.out.print("numbers 배열에 저장된 값: ");
        for (int i = 0;i<10;i++) System.out.print(numbers[i]+" ");
    }
}

package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int idex = 0;

        for (int i = 2;i <=10;i++){
            if (i%2==0){
                arr[idex] = i;
                idex++;
            }
        }

        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

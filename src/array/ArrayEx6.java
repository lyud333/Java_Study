package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[][] score = new int[][]{{89,76,100,68,48,98,56,77,95},{50,60,70,100,99,88,83,78,93}};
        int total = 0;
        char classa = 'A';
        for (int i = 0;i< score.length;i++){
            for (int j = 0;j< score[i].length;j++){
                total += score[i][j];
            }
            double avg = (double) total/ score[i].length;
            System.out.printf(classa+ "반 평균: %.1f\n", avg);
            classa++;
            total = 0;
        }
    }
}

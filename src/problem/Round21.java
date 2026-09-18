package problem;

public class Round21 {
    public static void main(String[] args) {
        int[] score = {78, 95, 64, 88, 100, 73, 82, 59, 91, 67};
        int count=0;
        for (int i=0;i<score.length;i++){
            if (score[i]>=90) count+=1;
        }
        System.out.println("점수가 90점 이상인 학생은 "+count+"명입니다.");
    }
}

package chapter2;

public class OperationAssignment6 {
    public static void main(String[] args) {
        int kor = 85;
        int eng = 90;
        int math = 78;
        int total = kor + eng + math;
        double avg = total / (float)3;
        boolean pass = (avg >= 80);
        System.out.printf("합계: %d\n",total);
        System.out.printf("평균: %.1f\n", avg);
        System.out.printf("결과: %s\n", pass ? "통과" : "불통");

    }
}

package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001,"Lee");

        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학",50);

        Student studentKim = new Student(1002,"Kim");

        studentKim.setKoreanSubject("국어", 85);
        studentKim.setMathSubject("수학",75);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

    }
}

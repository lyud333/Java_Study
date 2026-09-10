package classpart;

import org.w3c.dom.ls.LSOutput;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName ="이순신";

        Student studentAhn = new Student();
        studentAhn.studentName ="안중근";

        Student studentKim = new Student();
        studentKim.studentName ="김좌진";


        System.out.println(studentLee.getStudentName());
        System.out.println(studentAhn.getStudentName());
        System.out.println(studentKim.getStudentName());
    }

    public void showStudentInfo() {
        System.out.println(studentName+","+address);
    }
}

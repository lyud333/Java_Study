package staticdemo;

public class Student {

    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student(){
        serialNum++;
        studentID = serialNum;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum() {
        int i =0;
//        studentName = "이지원";
        return serialNum;

    }
    public static void setSerialNum(int serialNum) {
        Student.serialNum=serialNum;
    }
}

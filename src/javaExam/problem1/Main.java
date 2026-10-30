package javaExam.problem1;

import java.util.Scanner;

class Student {
    private int sId;
    private String sName;
    private int grade;
    private String major;

    Student(int sId, String sName, int grade, String major) {
        this.sId = sId;
        this.sName = sName;
        this.grade = grade;
        this.major = major;
    }

    void setMajor(String major) {
        this.major = major;
    }

    void setGrade(int grade) {
        this.grade = grade;
    }

    void showInfo() {
        System.out.println("학번: " + sId);
        System.out.println("이름: " + sName);
        System.out.println("학년: " + grade);
        System.out.println("전공: " + major);
    }
}

class Main {
    public static void main(String[] args) {
        Student studentLee = new Student(1101, "김철수", 1, "공통과");
        Scanner input = new Scanner(System.in);

        int grade = input.nextInt();
        input.nextLine();
        String major = input.nextLine();

        studentLee.setGrade(grade);
        studentLee.setMajor(major);

        System.out.println("==진급 후==");
        studentLee.showInfo();
    }
}

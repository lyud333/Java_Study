package array;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> student= new ArrayList<Student>();

        student.add(new Student("이유찬","79"));
        student.add(new Student("구경모","91"));
        student.add(new Student("이우재","88"));

        for (int i = 0; i < student.size(); i++) {
            student.get(i).showInfo();
        }
        student.remove(0);
        for (int i = 0; i < student.size(); i++) {
            student.get(i).showInfo();
        }
        System.out.println(student.isEmpty());

        student.removeAll(student);
        for (int i = 0; i < student.size(); i++) {
            student.get(i).showInfo();
        }
        System.out.println(student.isEmpty());
    }
}

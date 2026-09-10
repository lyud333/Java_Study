package hiding.company;

public class Employee {
    public  String name = "철수";
    protected String department = "개발팀";
    String email = "soo@company.com";
    private int salary = 5000000;

    public void printInfo(){
        System.out.println(name);
        System.out.println(department);
        System.out.println(email);
        System.out.println(salary);
    }
}

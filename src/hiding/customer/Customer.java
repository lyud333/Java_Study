package hiding.customer;

import hiding.company.Employee;

public class Customer {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println(emp.name); // public 이라 다른 패키지에서도 접근 가능

        // department(protected), email(default), salary(private) 는
        // 다른 패키지에서 직접 접근할 수 없으므로 public 메서드를 통해 출력한다.
        emp.printInfo();
    }
}

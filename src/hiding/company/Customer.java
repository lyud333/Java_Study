package hiding.customer;

import hiding.company.Employee;

public class Customer {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.name);
        System.out.println(emp.department);
        System.out.println(emp.email);
        System.out.println(emp.salary);
    }
}
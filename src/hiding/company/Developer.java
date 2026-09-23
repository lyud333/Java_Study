package hiding.company;

public class Developer extends Employee {
    public static void main(String[] args) {
        Developer dev = new Developer();

        System.out.println(dev.name);        // public
        System.out.println(dev.department);  // protected (상속 + 같은 패키지)
        System.out.println(dev.email);       // default (같은 패키지)
        System.out.println(dev.getSalary()); // private -> getter로 접근
    }
}

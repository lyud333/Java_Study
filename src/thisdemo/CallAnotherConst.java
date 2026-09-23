package thisdemo;


public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnSelf();
        System.out.println(p);
        System.out.println(noName);
    }
}

class Person {
    String name;
    int age;

    Person() {
        this("이름 없음",1);
    }

    Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    Person returnSelf() {
        return this;
    }
}
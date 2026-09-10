package constuctor;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person("이순신");
        Person personAhn = new Person();
        Person personKim = new Person("김좌진",85.5f,180.0f);

        personAhn.name = "안중근";

        System.out.println(personLee.name);
        System.out.println(personAhn.name);
        System.out.println(personKim.name);
    }
}

package thisdemo;


public class ReturnItself {
    public static void main(String[] args) {

        ChainStudent studentlee = new ChainStudent();
        studentlee.setId(12345).setName("김원상").setGrade(3).showStudentInfo();
    }
}
class ChainStudent{
    private int id;
    private String name;
    private int grade;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public ChainStudent setId(int id){
        this.id=id;
        return this;
    }
    public ChainStudent setName(String name){
        this.name=name;
        return this;
    }
    public ChainStudent setGrade(int grade){
        this.grade=grade;
        return this;
    }
    public void showStudentInfo(){
        System.out.println(name+"님의 학번은 "+id+"이고, "+grade+"학년입니다.");
    }
}

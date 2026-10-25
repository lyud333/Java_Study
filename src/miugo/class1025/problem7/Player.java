package miugo.class1025.problem7;

public class Player {
    String name;
    int level;
    int pExp;

    Player(String name, int level, int exp){
        this.name=name;
        this.level=level;
        this.pExp=pExp;

    }
    public void gainExp(int exp){
        this.pExp+=exp;
        while (this.pExp>=100){
            level++;
            System.out.print("레벨업! ");
            pExp-=100;
        }
        System.out.println("Lv."+level+"("+pExp+"/100)");
    }
}

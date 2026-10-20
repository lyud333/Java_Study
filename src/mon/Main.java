package mon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"슬라임","고블린","오크","드래곤","해골병사"};
        int[] hps = {30,50,120,500,60};
        int[] attacks = {5, 12, 25, 80, 15};
        int maxattack=0;
        int sumhp=0;
        List<String> list = new ArrayList<>(Arrays.asList());

        Monster[] book = new  Monster[names.length];
        for (int i = 0; i < names.length; i++) {
            book[i] = new Monster();
            book[i].name = names[i];
            book[i].hp = hps[i];
            book[i].attack = attacks[i];
        }
        for (int i = 0; i < names.length; i++) {
            if(attacks[i]>maxattack) maxattack=attacks[i];
            sumhp+=hps[i];
            if (hps[i]>=100) list.add(names[i]);
        }




        Monster strongest =book[0];
        for (Monster m : book){
            if (m.attack>strongest.attack){
                strongest=m;
            }
        }
        System.out.println("공격력 최강: "+strongest.name);
        System.out.println("체력합계: "+sumhp);
        System.out.print("체력 100 이상: ");
        for (Monster m : book){
            if (m.hp>=100){
                System.out.print(m.name+" ");
            }
        }
    }
}

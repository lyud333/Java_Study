package array;

import java.util.ArrayList;

public class Dogtest {
    public static void main(String[] args) {
        Dog[] dogArr =new Dog[5];

        dogArr[0]=new Dog("멍멍이","치와와");
        dogArr[1]=new Dog("뽀삐","진돗개");
        dogArr[2]=new Dog("순심이","삽살개");
        dogArr[3]=new Dog("철이","마르티스");
        dogArr[4]=new Dog("삐쭈","푸들");

        for (Dog dog : dogArr) {
            dog.showDogInfo();
        }
    }


}

package chapter2;

public class ImplicitCOnversion2 {

    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
    }
}

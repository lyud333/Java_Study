package array;

public class ArrayEx7 {
    public static void main(String[] args) {
        char[] alpha1 = new char[13];
        char[] alpha2 = new char[13];
        char[] alpha = new char[26];
        for (int i = 0; i < alpha1.length; i++) {
            alpha1[i] = (char)('A'+i);
            alpha2[i] = (char)('N'+i);
        }
        System.arraycopy(alpha1,0,alpha,0,alpha1.length);
        System.arraycopy(alpha2,0,alpha,alpha1.length,alpha2.length);
        System.out.println(alpha);



    }
}

package Ifexample;

public class ConditionEx9 {
    public static void main(String[] args) {
        int num1 =20;int num2 =5; char op = '/';
        switch (op){
            case '+':
                int total = num1+num2;
                System.out.println(num1+"+"+num2+"="+total);
                break;
            case '-':
                int sub = num1 - num2;
                System.out.println(num1+"-"+num2+"="+sub);
                break;
            case '*':
                int mul = num1*num2;
                System.out.println(num1+"*"+num2+"="+mul);
                break;
            case '/':
                if (num2!=0){
                    int m = num1/num2;
                    System.out.println(num1+"/"+num2+"="+m);
                }else {
                    System.out.println("0으로 나눌수없음");
                }
                break;

            default:
                System.out.println("잘못된 연산자");
        }
    }
}

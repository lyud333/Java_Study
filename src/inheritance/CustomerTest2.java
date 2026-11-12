package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030,"나몰라",1102);
        vc.bonusPoint = 1000;

        System.out.println(vc.customerName+"님이 지불해야할 금액은 "+
                vc.calcPrice(10000)+"원입니다.");
    }
}

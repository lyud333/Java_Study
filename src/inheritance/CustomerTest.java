package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.customerID=10010;
//        customerLee.customerName = "이순신";
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.customerID = 10020;
        customerKim.customerName = "김유신";
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        System.out.println();
        VIPCustomer customerJang = new VIPCustomer(10020,"장보고",1101);
        customerJang.bonusPoint = 20000;
//        System.out.println(customerJang.showCustomerInfo());
        System.out.println(customerJang.showVIPInfo());


    }

}

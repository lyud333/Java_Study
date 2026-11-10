package inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;
    public VIPCustomer(){
        super();
        saleRatio=0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID,customerName);
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        this.agentID = agentID;
        System.out.println("하위 클래스 VIPCustomer(int,String) 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }
    public String showVIPInfo(){
        return super.showCustomerInfo() +"\n담당 상담원 아이디는 "+agentID+"입니다.";
    }
}

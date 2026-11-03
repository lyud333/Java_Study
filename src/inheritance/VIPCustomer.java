package inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;
    public VIPCustomer(){
        saleRatio=0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    public int getAgentID(){
        return agentID;
    }

}

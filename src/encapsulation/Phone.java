package encapsulation;

public class Phone {
    private String model;
    private double price;

    public static void main(String model, double price) {
        this.model=model;
        this.price=price;
    }
    public String getModel(){
        return model;
    }

    public double getPrice(){
        return price;
    }
}

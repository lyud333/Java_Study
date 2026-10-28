package stream.ioTest;

public class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model,String color ,int price){
        this.model=model;
        this.color=color;
        this.price=price;
    }

    public void showCar(){
        System.out.println("Model: "+model);
        System.out.println("Model: "+color);
        System.out.println("Model: "+price);
    }
}

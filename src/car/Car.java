package car;

public class Car {
    private static int serialNum = 10001;
    int carNum;

    public Car(){
        carNum = serialNum;
        serialNum++;
    }

    public int getCarNum() {
        return carNum;
    }
}

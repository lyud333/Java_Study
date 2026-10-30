package javaExam.problem6;

import java.util.ArrayList;
import java.util.Scanner;

class Device {
    private int deviceId;
    private String deviceName;
    private boolean power = false;

    Device(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    void showInfo() {
        System.out.println("기기 번호: " + deviceId);
        System.out.println("기기 이름: " + deviceName);
        System.out.println("전원 상태: " + power);
    }
}

class SmartHome {
    private static SmartHome smartHome = new SmartHome();
    private SmartHome() {}
    ArrayList<Device> devices = new ArrayList<Device>();

    static SmartHome getInstance() {
        if (smartHome == null) {
            smartHome = new SmartHome();
        }
        return smartHome;
    }

    void addDevice(Device device) {
        devices.add(device);
    }

    void showDevices() {
        System.out.println("==등록된 기기==");
        for (Device device : devices) {
            device.showInfo();
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmartHome smartHome = SmartHome.getInstance();

        int deviceNumber = sc.nextInt();
        sc.nextLine();
        String deviceName = sc.nextLine();

        while (deviceNumber != 0) {
            smartHome.addDevice(new Device(deviceNumber, deviceName));
            deviceNumber = sc.nextInt();
            sc.nextLine();
            deviceName = sc.nextLine();
        }

        smartHome.showDevices();
    }
}

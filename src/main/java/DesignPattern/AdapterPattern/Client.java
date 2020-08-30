package DesignPattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        SmartPhone smartPhone = new IPhone();
        smartPhone.videoCall();

        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.videoCall();
        electronicDevice.shoot();
    }
}

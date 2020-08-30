package DesignPattern.AdapterPattern;

public class ElectronicDevice implements SmartPhone, Camera{
    @Override
    public void videoCall() {
        System.out.println("Electronic Device can call to someone");
    }

    @Override
    public void shoot() {
        System.out.println("Electronic Device can shoot photo also");
    }
}

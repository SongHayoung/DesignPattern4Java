package DesignPattern.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        AbstractDeviceFactory fac;

        fac = DeviceFactoryFactory.getFactory(Company.SAMSUNG);
        fac.createPhone();
        fac.createEarphone();

        fac = DeviceFactoryFactory.getFactory(Company.APPLE);
        fac.createPhone();
        fac.createEarphone();
    }
}

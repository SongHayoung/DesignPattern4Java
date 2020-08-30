package DesignPattern.AbstractFactoryPattern;

public class DeviceFactoryFactory {
    public static AbstractDeviceFactory getFactory(Company company) {
        AbstractDeviceFactory factory = null;
        switch (company) {
            case APPLE:
                factory = AppleDeviceFactory.getInstance();
                break;
            case SAMSUNG:
                factory = SamsungDeviceFactory.getInstance();
                break;
        }

        return  factory;
    }
}

package DesignPattern.AbstractFactoryPattern;

import DesignPattern.AbstractFactoryPattern.Device.Earphone.AppleEarphone;
import DesignPattern.AbstractFactoryPattern.Device.Earphone.Earphone;
import DesignPattern.AbstractFactoryPattern.Device.Phone.ApplePhone;
import DesignPattern.AbstractFactoryPattern.Device.Phone.Phone;

public class AppleDeviceFactory extends AbstractDeviceFactory{
    private static AbstractDeviceFactory appleDeviceFactory = new AppleDeviceFactory();
    private AppleDeviceFactory() {}

    public static AbstractDeviceFactory getInstance() {
        return appleDeviceFactory;
    }

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Earphone createEarphone() {
        return new AppleEarphone();
    }
}

package DesignPattern.AbstractFactoryPattern;

import DesignPattern.AbstractFactoryPattern.Device.Earphone.Earphone;
import DesignPattern.AbstractFactoryPattern.Device.Earphone.SamsungEarphone;
import DesignPattern.AbstractFactoryPattern.Device.Phone.Phone;
import DesignPattern.AbstractFactoryPattern.Device.Phone.SamsungPhone;

public class SamsungDeviceFactory extends AbstractDeviceFactory{
    private static AbstractDeviceFactory samsungDeviceFactory = new SamsungDeviceFactory();
    private SamsungDeviceFactory() {}

    public static AbstractDeviceFactory getInstance() {
        return samsungDeviceFactory;
    }

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Earphone createEarphone() {
        return new SamsungEarphone();
    }
}

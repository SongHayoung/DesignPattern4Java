package DesignPattern.AbstractFactoryPattern;

import DesignPattern.AbstractFactoryPattern.Device.Earphone.Earphone;
import DesignPattern.AbstractFactoryPattern.Device.Phone.Phone;

public abstract class AbstractDeviceFactory {
    public abstract Phone createPhone();
    public abstract Earphone createEarphone();
}

package DesignPattern.AdapterPattern;

public class SonyCamera implements Camera{
    @Override
    public void shoot() {
        System.out.println("SonyCamera Running");
    }
}

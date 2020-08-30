package DesignPattern.AdapterPattern;

public class IPhone implements SmartPhone{
    private Camera camera;

    public IPhone() {
        camera = new SonyCamera();
    }

    @Override
    public void videoCall() {
        System.out.println("IPhone Calling");
        camera.shoot();
    }
}

package DesignPattern.BridgePattern;

public class BConcreteDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Draw Circle with API B");
        System.out.println("Draw Circle at " + x + ":" + y + " " + radius);
    }
}

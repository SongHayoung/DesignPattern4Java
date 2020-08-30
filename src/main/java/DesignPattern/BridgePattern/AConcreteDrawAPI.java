package DesignPattern.BridgePattern;

public class AConcreteDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Draw Circle with API A");
        System.out.println("Draw Circle at " + x + ":" + y + " " + radius);
    }
}

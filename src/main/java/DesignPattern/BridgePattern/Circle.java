package DesignPattern.BridgePattern;

public class Circle implements Shape{
    private DrawAPI drawAPI;
    private double x;
    private double y;
    private double radius;


    public Circle(double x, double y, double radius, DrawAPI drawAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawAPI = drawAPI;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}

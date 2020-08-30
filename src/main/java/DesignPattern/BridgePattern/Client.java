package DesignPattern.BridgePattern;

public class Client {
    public static void main(String[] args) {
        Shape circleA = new Circle(1.0, 1.0, 1.0, new AConcreteDrawAPI());
        Shape circleB = new Circle(1.0, 1.0, 1.0, new BConcreteDrawAPI());

        circleA.draw();
        circleB.draw();
    }
}

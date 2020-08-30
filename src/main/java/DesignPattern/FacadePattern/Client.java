package DesignPattern.FacadePattern;

public class Client {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.runRobot();
        robot.offRobot();
    }
}

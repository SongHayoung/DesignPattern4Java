package DesignPattern.VisitorPattern;

public class Client {
    public static void main(String[] args) {
        buildIronMan();
        buildGundam();
    }

    public static void buildIronMan() {
        RobotElementSuit ironMan = new RobotElementSuit();
        ironMan.activate(new IronManVisitor());
    }

    public static void buildGundam() {
        RobotElementSuit gundam = new RobotElementSuit();
        gundam.activate(new GundamVisitor());
    }
}

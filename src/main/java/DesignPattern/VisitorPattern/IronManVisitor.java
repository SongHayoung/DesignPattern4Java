package DesignPattern.VisitorPattern;

public class IronManVisitor implements RobotVisitor {
    @Override
    public void activate(RobotElementArm arm) {
        System.out.println("Iron Man Arm on Activation");
    }

    @Override
    public void activate(RobotElementLeg leg) {
        System.out.println("Iron Man Leg on Activation");
    }

    @Override
    public void activate(RobotElementBody body) {
        System.out.println("Iron Man Body on Activation");
    }

    @Override
    public void activate(RobotElementSuit suit) {
        System.out.println("Iron Man Suit on Active");
        System.out.println("Let's Roll!!");
    }
}

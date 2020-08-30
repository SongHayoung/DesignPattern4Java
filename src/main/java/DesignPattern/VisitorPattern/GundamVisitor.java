package DesignPattern.VisitorPattern;

public class GundamVisitor implements RobotVisitor {
    @Override
    public void activate(RobotElementArm arm) {
        System.out.println("Gundam Arm on Activation");
    }

    @Override
    public void activate(RobotElementLeg leg) {
        System.out.println("Gundam Leg on Activation");
    }

    @Override
    public void activate(RobotElementBody body) {
        System.out.println("Gundam Body on Activation");
    }

    @Override
    public void activate(RobotElementSuit suit) {
        System.out.println("Gundam Robot on Active");
        System.out.println("アムロ行きます！！");
    }
}

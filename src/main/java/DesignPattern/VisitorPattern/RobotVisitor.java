package DesignPattern.VisitorPattern;

public interface RobotVisitor {
    public void activate(RobotElementArm arm);
    public void activate(RobotElementLeg leg);
    public void activate(RobotElementBody body);
    public void activate(RobotElementSuit suit);
}

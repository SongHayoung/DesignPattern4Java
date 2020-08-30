package DesignPattern.VisitorPattern;

public class RobotElementArm implements RobotElement{
    @Override
    public void activate(RobotVisitor visitor) {
        visitor.activate(this);
    }
}

package DesignPattern.VisitorPattern;

public class RobotElementBody implements RobotElement {
    @Override
    public void activate(RobotVisitor visitor) {
        visitor.activate(this);
    }
}

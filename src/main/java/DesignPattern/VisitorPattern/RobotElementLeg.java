package DesignPattern.VisitorPattern;

public class RobotElementLeg implements RobotElement {
    @Override
    public void activate(RobotVisitor visitor) {
        visitor.activate(this);
    }
}

package DesignPattern.VisitorPattern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RobotElementSuit implements RobotElement {
    private List<RobotElement> list;

    public RobotElementSuit() {
        list = new LinkedList<>();
        list.addAll(Arrays.asList(
                new RobotElementArm(),
                new RobotElementArm(),
                new RobotElementLeg(),
                new RobotElementLeg(),
                new RobotElementBody()
        ));
    }
    @Override
    public void activate(RobotVisitor visitor) {
        for(RobotElement element : list)
            element.activate(visitor);
        visitor.activate(this);
    }
}

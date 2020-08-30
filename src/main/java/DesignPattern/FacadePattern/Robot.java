package DesignPattern.FacadePattern;

public class Robot {
    private RobotEye robotEye;
    private RobotArm robotArm;
    private RobotLeg robotLeg;

    public Robot() {
        this.robotEye = new RobotEye();
        this.robotArm = new RobotArm();
        this.robotLeg = new RobotLeg();
    }

    public void runRobot() {
        this.robotEye.run();
        this.robotArm.run();
        this.robotLeg.run();
    }

    public void offRobot() {
        this.robotEye.off();
        this.robotArm.off();
        this.robotLeg.off();
    }
}

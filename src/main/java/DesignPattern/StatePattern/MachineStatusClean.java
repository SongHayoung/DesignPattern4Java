package DesignPattern.StatePattern;

public class MachineStatusClean implements MachineStatus {
    @Override
    public void click(CoffeeMachine coffeeMachine) {
        System.out.println("청소중 입니다!");
        coffeeMachine.setMachineStatue(new MachineStatusRun());
    }
}

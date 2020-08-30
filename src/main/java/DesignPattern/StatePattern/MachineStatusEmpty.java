package DesignPattern.StatePattern;

public class MachineStatusEmpty implements MachineStatus{
    @Override
    public void click(CoffeeMachine coffeeMachine) {
        System.out.println("커피가 없습니다!");
    }
}

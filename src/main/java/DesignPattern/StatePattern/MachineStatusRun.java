package DesignPattern.StatePattern;

public class MachineStatusRun implements MachineStatus{
    @Override
    public void click(CoffeeMachine coffeeMachine) {
        System.out.println("커피를 뽑습니다!");
        coffeeMachine.useCup();
        System.out.println("남은 커피 : " + coffeeMachine.getCup());

        if(coffeeMachine.isEmpty())
            coffeeMachine.setMachineStatue(new MachineStatusEmpty());
        else if(coffeeMachine.isClean())
            coffeeMachine.setMachineStatue(new MachineStatusClean());
    }
}

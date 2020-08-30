package DesignPattern.StatePattern;

public class CoffeeMachine {
    private MachineStatus machineStatue;
    private int cup;

    public CoffeeMachine() {
        this.machineStatue = new MachineStatusRun();
        this.cup = 15;
    }

    public void getCoffee() {
        machineStatue.click(this);
    }

    public int getCup() {
        return cup;
    }

    public void useCup() {
        --cup;
    }

    public boolean isEmpty() {
        return getCup() == 0;
    }

    public boolean isClean() {
        return getCup() % 10 == 0;
    }

    public void setMachineStatue(MachineStatus machineStatue) {
        this.machineStatue = machineStatue;
    }
}

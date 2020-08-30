package DesignPattern.ChainOfResponsibilityPattern;

import java.util.Objects;

public abstract class CalculatorHandler {
    protected CalculatorHandler calculatorHandler;
    protected Operation op;

    public CalculatorHandler(Operation op) {
        this.op = op;
    }

    void setNext(CalculatorHandler calc) {
        if(Objects.isNull(calculatorHandler))
            calculatorHandler = calc;
        else
            calculatorHandler.setNext(calc);
    }

    abstract void calculate(int n1, int n2, Operation op);
}

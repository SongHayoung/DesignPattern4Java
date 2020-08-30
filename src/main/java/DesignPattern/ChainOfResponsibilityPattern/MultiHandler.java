package DesignPattern.ChainOfResponsibilityPattern;

import java.util.Objects;

public class MultiHandler extends CalculatorHandler{
    public MultiHandler() {
        super(Operation.MULTI);
    }

    @Override
    void calculate(int n1, int n2, Operation op) {
        if(op.equals(this.op))
            System.out.printf("%d * %d = %d\n",n1, n2, n1 * n2);
        else if(!Objects.isNull(calculatorHandler))
            calculatorHandler.calculate(n1, n2, op);
    }
}

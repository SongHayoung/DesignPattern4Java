package DesignPattern.ChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        CalculatorHandler calculatorHandler = new PlusHandler();
        calculatorHandler.setNext(new MinusHandler());
        calculatorHandler.setNext(new MultiHandler());
        calculatorHandler.setNext(new DivideHandler());

        calculatorHandler.calculate(5, 5, Operation.PLUS);
        calculatorHandler.calculate(5, 5, Operation.MINUS);
        calculatorHandler.calculate(5, 5, Operation.MULTI);
        calculatorHandler.calculate(5, 5, Operation.DIVIDE);
    }
}

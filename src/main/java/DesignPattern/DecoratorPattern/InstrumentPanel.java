package DesignPattern.DecoratorPattern;

public class InstrumentPanel implements Panel{
    @Override
    public void show() {
        System.out.println("차량 계기판 표시");
    }
}

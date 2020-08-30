package DesignPattern.StatePattern;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        for(int i = 0; i < 20; i++)
            coffeeMachine.getCoffee();
    }
}

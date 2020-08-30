package DesignPattern.BuilderPattern;

public class Client {
    static public void main(String[] args) {
        Pizza pepperoniPizza = new Pizza.Builder().dough("Flour").sauce("Tomato")
                .topping("Pepperoni").build();
        Pizza pineapplePizza = new Pizza.Builder().dough("Flour").topping("PineApple").build();
        System.out.println(pepperoniPizza.toString());
        System.out.println(pineapplePizza.toString());
    }
}

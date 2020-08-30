package DesignPattern.TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        getCoffee();
        getTea();
    }

    private static void getCoffee() {
        Drinks coffee = new Coffee();
        coffee.prepareDrinks();
    }

    private static void getTea() {
        Drinks tea = new Tea();
        tea.prepareDrinks();
    }
}

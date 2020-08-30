package DesignPattern.TemplateMethodPattern;

public class Tea extends Drinks{
    @Override
    protected void brew() {
        System.out.println("Brewing Tea...");
    }

    @Override
    protected void preparedDrink() {
        System.out.println("Your Tea is Ready!!");
    }
}

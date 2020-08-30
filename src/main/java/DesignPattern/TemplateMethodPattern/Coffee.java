package DesignPattern.TemplateMethodPattern;

import java.util.Scanner;

public class Coffee extends Drinks{
    @Override
    protected void brew() {
        System.out.println("Brewing Coffee Beans...");
    }

    //훅 메소드의 구현
    @Override
    protected boolean needExtraToppings() {
        System.out.println("Need Extra Toppings?");
        String input = getInput();
        return input.equals("YES");
    }

    private String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    @Override
    protected void addExtraToppings() {
        System.out.println("Add Some Milk...");
    }

    @Override
    protected void preparedDrink() {
        System.out.println("Your Coffee is Ready!!");
    }
}

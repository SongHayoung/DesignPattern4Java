package DesignPattern.CompositePattern;

public class Circle implements Graphic{
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("This Leaf is " + name);
    }
}

package DesignPattern.CompositePattern;

public class Square implements Graphic{
    private String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("This Leaf is " + name);
    }
}

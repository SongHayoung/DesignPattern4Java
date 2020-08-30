package DesignPattern.FactoryMethodPattern;

public class WordDocument implements Document{
    public WordDocument() {
        System.out.println("Word Document Create");
    }

    public void Context() {
        System.out.println("Word Document Context");
    }

    public void Close() {
        System.out.println("Word Document Close");
    }
}

package DesignPattern.FactoryMethodPattern;

public class PdfDocument implements Document{
    public PdfDocument() {
        System.out.println("Pdf Document Create");
    }

    public void Context() {
        System.out.println("Pdf Document Context");
    }

    public void Close() {
        System.out.println("Pdf Document Close");
    }
}

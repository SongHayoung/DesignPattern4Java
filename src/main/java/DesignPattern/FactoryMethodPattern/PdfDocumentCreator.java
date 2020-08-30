package DesignPattern.FactoryMethodPattern;

public class PdfDocumentCreator implements DocumentCreator{
    public Document create() {
        return new PdfDocument();
    }
}

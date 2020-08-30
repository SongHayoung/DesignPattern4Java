package DesignPattern.FactoryMethodPattern;

public class WordDocumentCreator implements DocumentCreator{
    public Document create() {
        return new WordDocument();
    }
}

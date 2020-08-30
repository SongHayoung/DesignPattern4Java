package DesignPattern.FactoryMethodPattern;

public interface DocumentCreator {
    Document create();

    default void close(Document document) {
        document.Close();
    }
}

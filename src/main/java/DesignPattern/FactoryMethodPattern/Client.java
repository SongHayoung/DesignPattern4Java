package DesignPattern.FactoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        callDocument(new PdfDocumentCreator());
        callDocument(new WordDocumentCreator());
    }

    public static void callDocument(DocumentCreator documentCreator) {
        DocumentCreator creator = documentCreator;
        Document document = creator.create();
        document.Context();
        creator.close(document);
    }
}

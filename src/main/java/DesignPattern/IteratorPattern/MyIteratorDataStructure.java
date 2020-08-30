package DesignPattern.IteratorPattern;

import java.util.Iterator;
import java.util.Objects;

public class MyIteratorDataStructure<T> {
    private Node<T> first;

    public MyIteratorDataStructure(T data) {
        first = new Node<>(data);
    }

    public MyIteratorDataStructure() {}

    public void append(T data) {
        if(Objects.isNull(first)) {
            first = new Node<>(data);
        } else {
            Node node = first;
            while(Objects.nonNull(node.getNext()))
                node = node.getNext();
            node.setNext(new Node<>(data));
        }
    }

    public void loop() {
        Node node = first;
        while(Objects.nonNull(node)) {
            node.item();
            node = node.getNext();
        }
    }
}

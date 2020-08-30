package DesignPattern.IteratorPattern;

public class Client {
    public static void main(String[] args) {
        MyIteratorDataStructure<Integer> iteratorDataStructure = new MyIteratorDataStructure<>();
        iteratorDataStructure.append(1);
        iteratorDataStructure.append(2);
        iteratorDataStructure.append(3);
        iteratorDataStructure.append(4);
        iteratorDataStructure.append(5);

        iteratorDataStructure.loop();
    }
}

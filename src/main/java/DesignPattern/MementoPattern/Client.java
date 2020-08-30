package DesignPattern.MementoPattern;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator(new State(3, 'A'), "Pawn");

        caretaker.save(originator.createMemento());
        originator.move(new State(4, 'A'));

        caretaker.save(originator.createMemento());
        originator.move(new State(5, 'A'));

        caretaker.save(originator.createMemento());
        originator.move(new State(5, 'B'));

        originator.setMemento(caretaker.undo());
        originator.setMemento(caretaker.undo());
        originator.setMemento(caretaker.undo());
    }
}

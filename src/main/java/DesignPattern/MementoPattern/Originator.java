package DesignPattern.MementoPattern;

public class Originator {
    private State state;
    private String name;

    public Originator(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println(name + " Undo col : " + this.state.getCol() + " row : " + this.state.getRow());
    }

    public void move(State state) {
        this.state = state;
        System.out.println(name + " Move col : " + this.state.getCol() + " row : " + this.state.getRow());
    }
}

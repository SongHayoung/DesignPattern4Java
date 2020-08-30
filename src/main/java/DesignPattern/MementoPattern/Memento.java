package DesignPattern.MementoPattern;

public class Memento {
    private State state;

    public Memento(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}

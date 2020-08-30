package DesignPattern.ObserverPattern;

public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + " received : " + state);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConcreteObserver))
            return false;
        ConcreteObserver concreteObserver = (ConcreteObserver)obj;
        return this.name.equals(concreteObserver.name);
    }
}

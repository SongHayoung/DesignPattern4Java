package DesignPattern.ObserverPattern;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String notification);
}

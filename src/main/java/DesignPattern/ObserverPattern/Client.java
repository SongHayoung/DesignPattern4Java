package DesignPattern.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("observer 1");
        Observer observer2 = new ConcreteObserver("observer 2");
        Observer observer3 = new ConcreteObserver("observer 3");
        Observer observer4 = new ConcreteObserver("observer 4");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.notify("Notification 1");

        subject.detach(observer1);
        subject.attach(observer4);

        subject.notify("Notification 2");
    }
}

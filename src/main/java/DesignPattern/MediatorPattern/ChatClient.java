package DesignPattern.MediatorPattern;

public interface ChatClient {
    void setMediator(Mediator mediator);
    void display(String message);
    void send(String message);
    void quit();
}

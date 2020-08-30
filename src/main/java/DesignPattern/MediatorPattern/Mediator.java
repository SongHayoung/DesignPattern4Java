package DesignPattern.MediatorPattern;

public interface Mediator {
    void addClient(ChatClient client);
    void removeClient(ChatClient client);
    void mediate(ChatClient client, String message);
}

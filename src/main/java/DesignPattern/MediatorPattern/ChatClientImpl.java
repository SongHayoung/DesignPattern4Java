package DesignPattern.MediatorPattern;

public class ChatClientImpl implements ChatClient{
    private Mediator mediator;
    private String name;

    public ChatClientImpl(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.mediate(this, "From " + name + " : " + message);
    }

    @Override
    public void display(String message) {
        System.out.println(name + " : " + message);
    }

    @Override
    public void quit() {
        mediator.removeClient(this);
    }
}

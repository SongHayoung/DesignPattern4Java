package DesignPattern.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        ChatClient client1 = new ChatClientImpl("Client1");
        ChatClient client2 = new ChatClientImpl("Client2");
        ChatClient client3 = new ChatClientImpl("Client3");
        ChatClient client4 = new ChatClientImpl("Client4");
        ChatClient client5 = new ChatClientImpl("Client5");
        Mediator mediator = new MediatorImpl(client1, client2, client3, client4);

        client1.setMediator(mediator);
        client2.setMediator(mediator);
        client3.setMediator(mediator);
        client4.setMediator(mediator);

        client1.send("Hello");
        client2.send("Hi Client1");
        client3.send("Bye");

        client3.quit();

        mediator.addClient(client5);
        client5.setMediator(mediator);

        client5.send("I`m noob");
    }
}

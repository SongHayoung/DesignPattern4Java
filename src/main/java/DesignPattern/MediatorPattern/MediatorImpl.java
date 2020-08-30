package DesignPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private List<ChatClient> clients;

    public MediatorImpl() {
        this.clients = new ArrayList<>();
    }

    public MediatorImpl(ChatClient client) {
        this();
        clients.add(client);
    }

    public MediatorImpl(ChatClient client, ChatClient... varClients) {
        this(client);
        for(ChatClient chatClient : varClients)
            clients.add(chatClient);
    }

    @Override
    public void addClient(ChatClient client) {
        clients.add(client);
    }

    @Override
    public void removeClient(ChatClient client) {
        clients.remove(client);
    }

    @Override
    public void mediate(ChatClient client, String message) {
        for(ChatClient chatClient : clients)
            if(!chatClient.equals(client))
                chatClient.display(message);
    }
}

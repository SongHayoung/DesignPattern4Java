package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Receiver {
    private List<CommandComposite> commandComposites;

    public Receiver() {
        commandComposites = new ArrayList<>();
    }

    public void add(CommandComposite commandComposite) {
        commandComposites.add(commandComposite);
    }

    public void remove() {
        commandComposites.remove(commandComposites.size() - 1);
    }

    public void action() {
        for(CommandComposite commandComposite : commandComposites)
            commandComposite.execute();
    }
}

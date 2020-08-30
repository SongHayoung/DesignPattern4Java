package DesignPattern.CommandPattern;

public class InputCommandComposite implements CommandComposite{
    private InputCommand command;

    public InputCommandComposite(InputCommand command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.execute();
    }
}

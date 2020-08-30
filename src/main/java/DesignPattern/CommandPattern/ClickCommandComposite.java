package DesignPattern.CommandPattern;

public class ClickCommandComposite implements CommandComposite{
    private ClickCommand command;

    public ClickCommandComposite(ClickCommand command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.execute();
    }
}

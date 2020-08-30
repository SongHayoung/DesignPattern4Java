package DesignPattern.CommandPattern;

public class KeyboardInputCommand implements InputCommand{
    private String cmd;

    KeyboardInputCommand(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public void execute() {
        System.out.println("execute keyboard command" + cmd);
    }
}

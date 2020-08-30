package DesignPattern.CommandPattern;

public class RightClickCommand implements ClickCommand{
    @Override
    public void execute() {
        System.out.println("execute right click command");
    }
}

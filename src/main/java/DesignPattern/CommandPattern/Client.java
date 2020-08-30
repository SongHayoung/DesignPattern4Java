package DesignPattern.CommandPattern;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandComposite inputCommandComposite1 =
                new InputCommandComposite(new KeyboardInputCommand("This is new Macro"));
        CommandComposite inputCommandComposite2 =
                new InputCommandComposite(new KeyboardInputCommand("Macro Start"));
        CommandComposite clickCommandComposite =
                new ClickCommandComposite(new RightClickCommand());
        CommandComposite inputCommandComposite3 =
                new InputCommandComposite(new KeyboardInputCommand("Macro End"));

        receiver.add(inputCommandComposite1);
        receiver.add(inputCommandComposite2);
        receiver.add(clickCommandComposite);
        receiver.add(inputCommandComposite3);

        receiver.action();

        receiver.remove();
        receiver.remove();

        receiver.action();
    }
}

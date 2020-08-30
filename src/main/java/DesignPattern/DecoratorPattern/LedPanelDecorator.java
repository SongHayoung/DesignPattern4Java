package DesignPattern.DecoratorPattern;

public class LedPanelDecorator extends PanelDecorator{
    public LedPanelDecorator(Panel panel) {
        super(panel);
    }

    @Override
    public void show() {
        panel.show();
        getLedLights();
    }

    private void getLedLights() {
        System.out.println("계기판 LED 점등");
    }
}

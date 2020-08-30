package DesignPattern.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        buildPlanePanel();
        buildLedPanel();
        buildDistanceLedPanel();
    }

    public static void buildPlanePanel() {
        Panel panel = new InstrumentPanel();
        panel.show();
    }

    public static void buildLedPanel() {
        Panel panel = new LedPanelDecorator(new InstrumentPanel());
        panel.show();
    }

    public static void buildDistanceLedPanel() {
        Panel panel = new DistancePanelDecorator(new LedPanelDecorator(new InstrumentPanel()));
        panel.show();
    }
}

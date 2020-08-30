package DesignPattern.DecoratorPattern;

public abstract class PanelDecorator implements Panel{
    protected Panel panel;

    public PanelDecorator(Panel panel) {
        this.panel = panel;
    }
}

package DesignPattern.DecoratorPattern;

public class DistancePanelDecorator  extends PanelDecorator{
    public DistancePanelDecorator(Panel panel) {
        super(panel);
    }

    @Override
    public void show() {
        panel.show();
        getDistanceInfo();
    }

    private void getDistanceInfo() {
        System.out.println("계기판 이동 거리 표시");
    }
}

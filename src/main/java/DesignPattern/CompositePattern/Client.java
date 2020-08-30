package DesignPattern.CompositePattern;

public class Client {
    public static void main(String[] args) {
        GraphicComposite rootComposite = new GraphicComposite("rootComposite");
        GraphicComposite child1Composite = new GraphicComposite("child1Composite");
        GraphicComposite child2Composite = new GraphicComposite("child2Composite");

        Graphic graphicCircle1 = new Circle("graphicCircle1");
        Graphic graphicCircle2 = new Circle("graphicCircle2");

        Graphic graphicSquare1 = new Square("graphicSquare1");
        Graphic graphicSquare2 = new Square("graphicSquare2");

        rootComposite.add(child1Composite);
        rootComposite.add(child2Composite);

        child1Composite.add(graphicCircle1);
        child1Composite.add(graphicCircle2);

        child2Composite.add(graphicSquare1);
        child2Composite.add(graphicSquare2);

        rootComposite.show();
    }
}

package DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class GraphicComposite implements Graphic{
    private List<Graphic> graphicList;
    private String name;

    public GraphicComposite(String name) {
        this.name = name;
        graphicList = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println("This Composite is " + name);
        for(Graphic graphic : graphicList)
            graphic.show();
    }

    public void add(Graphic graphic) {
        graphicList.add(graphic);
    }

    public List<Graphic> remove() {
        return graphicList;
    }
}

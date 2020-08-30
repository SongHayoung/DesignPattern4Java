package DesignPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList;

    public Caretaker()
    {
        mementoList = new ArrayList<>();
    }

    void save(Memento memento) {
        mementoList.add(memento);
    }

    Memento undo(){
        return mementoList.remove(mementoList.size() - 1);
    }
}

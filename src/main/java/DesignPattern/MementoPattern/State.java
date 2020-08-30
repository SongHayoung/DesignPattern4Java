package DesignPattern.MementoPattern;

public class State {
    private int col;
    private char row;

    public State(int col, char row) {
        this.col = col;
        this.row = row;
    }

    public char getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

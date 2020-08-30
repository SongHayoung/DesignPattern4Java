package DesignPattern.FlyWeightPattern;

public class Character {
    private char c;

    public Character(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Character)) return false;
        Character character = (Character)obj;
        return character.c == c;
    }
}

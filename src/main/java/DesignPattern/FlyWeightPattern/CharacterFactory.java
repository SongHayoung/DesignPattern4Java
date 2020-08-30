package DesignPattern.FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public enum CharacterFactory {
    INSTANCE;

    private List<Character> list;

    private CharacterFactory() {
        list = new ArrayList<>();
    }

    Character getCharacter(char c) {
        for(Character character : list)
            if(character.getC() == c)
                return character;

         Character character = new Character(c);
         list.add(character);
         return character;
    }
}

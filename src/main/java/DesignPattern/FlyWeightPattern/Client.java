package DesignPattern.FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        addCharacter();
        getCharacter();
    }

    public static void addCharacter() {
        CharacterFactory.INSTANCE.getCharacter('a');
        CharacterFactory.INSTANCE.getCharacter('b');
        CharacterFactory.INSTANCE.getCharacter('c');
        CharacterFactory.INSTANCE.getCharacter('a');
        CharacterFactory.INSTANCE.getCharacter('d');
    }

    public static void getCharacter() {
        Character a = CharacterFactory.INSTANCE.getCharacter('a');
        Character aPrime = CharacterFactory.INSTANCE.getCharacter('a');
        Character b = CharacterFactory.INSTANCE.getCharacter('b');
        Character c = CharacterFactory.INSTANCE.getCharacter('c');
        Character d = CharacterFactory.INSTANCE.getCharacter('d');

        System.out.println(System.identityHashCode(a) + " " + a.getC());
        System.out.println(System.identityHashCode(aPrime) + " " + aPrime.getC());
        System.out.println(System.identityHashCode(b) + " " + b.getC());
        System.out.println(System.identityHashCode(c) + " " + c.getC());
        System.out.println(System.identityHashCode(d) + " " + d.getC());
    }
}

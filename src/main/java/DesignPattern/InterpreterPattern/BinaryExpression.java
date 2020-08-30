package DesignPattern.InterpreterPattern;

public class BinaryExpression implements Expression{
    public String interpret(String line) {
        int value = StringParser.getValue(line);
        return Integer.toBinaryString(value);
    }
}

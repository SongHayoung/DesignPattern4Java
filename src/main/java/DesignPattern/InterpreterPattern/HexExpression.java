package DesignPattern.InterpreterPattern;

public class HexExpression implements Expression{
    @Override
    public String interpret(String line) {
        int value = StringParser.getValue(line);
        return Integer.toHexString(value);
    }
}

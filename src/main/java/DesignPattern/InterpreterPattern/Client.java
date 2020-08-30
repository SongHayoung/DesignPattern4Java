package DesignPattern.InterpreterPattern;

public class Client {
    public static void main(String[] args) {
        Expression expression = new IntegerConverterExpression();
        String line1 = "Binary 1234";
        String line2 = "Hex 1234";
        String line3 = "Binary                         1234";
        String line4 = "Hex1234fakjwefakljhfawekljh";
        String line5 = "What did i say?";
        String line6 = "Hex 987654321";

        System.out.println(expression.interpret(line1));
        System.out.println(expression.interpret(line2));
        System.out.println(expression.interpret(line3));
        System.out.println(expression.interpret(line4));
        System.out.println(expression.interpret(line5));
        System.out.println(expression.interpret(line6));
    }
}

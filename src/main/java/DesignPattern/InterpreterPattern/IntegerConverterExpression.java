package DesignPattern.InterpreterPattern;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class IntegerConverterExpression implements Expression{
    private static final String UNSUPPORT = "Unsupported Expression : ";

    private enum Support{
        HEX("Hex"),
        BINARY("Binary");

        private String value;

        private Support(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    private Map<Support, Expression> expressionMapper;

    public IntegerConverterExpression() {
        expressionMapper = new TreeMap<>();
        expressionMapper.put(Support.HEX, new HexExpression());
        expressionMapper.put(Support.BINARY, new BinaryExpression());
    }

    @Override
    public String interpret(String line) {
        Optional<String> result;

        for(Map.Entry<Support, Expression> entry : expressionMapper.entrySet()) {
            result = StringParser.contains(entry.getKey().getValue(), line);
            if(result.isPresent())
                return entry.getValue().interpret(result.get());
        }

        return UNSUPPORT + line;
    }
}

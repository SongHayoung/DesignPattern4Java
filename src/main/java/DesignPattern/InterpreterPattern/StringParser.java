package DesignPattern.InterpreterPattern;

import java.util.Optional;

public class StringParser {
    private StringParser() {}

    private static int[] kmpTable(String s)
    {
        int len = s.length(), j = 0;
        int[] table = new int[len];

        for(int i = 1; i < len; i++) {
            while (j>0 && s.charAt(i) != s.charAt(j))
                j = table[j-1];
            if(s.charAt(i) == s.charAt(j))
                table[i] = ++j;
        }

        return table;
    }

    public static Optional<String> contains(final String pattern, final String context)
    {
        int[] table = kmpTable(pattern);
        int patternLen = pattern.length(), contextLen = context.length(), j = 0;

        for(int i = 0; i < contextLen; ++i){
            while(j>0 && context.charAt(i) != pattern.charAt(j))
                j = table[j - 1];

            if(context.charAt(i) == pattern.charAt(j))
                if(j == patternLen - 1)
                    return Optional.of(context.substring(i + 1));
                else
                    j++;
        }
        return Optional.empty();
    }

    public static int getValue(final String context)
    {
        int ret = 0, len = context.length(), index = 0;
        while(context.charAt(index) == ' ')
            ++index;

        while(index < len && '0' <= context.charAt(index) && context.charAt(index) <= '9')
            ret = (ret << 3) + (ret << 1) + (context.charAt(index++) & 0b1111);

        return ret;
    }
}

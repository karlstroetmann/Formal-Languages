package Assembler;

import java.util.*;

public class METHOD extends AssemblerCmd {
    private String  mName;
    private Integer mNumberArgs;

    public METHOD(String name, Integer numberArgs) {
        mName       = name;
        mNumberArgs = numberArgs;
    }
    public String toString() {
        String result = ".method public static " + mName + "(";
        for (int i = 0; i < mNumberArgs; ++i) {
            result += "I";
        }
        result += ")I";
        return result;
    }
}

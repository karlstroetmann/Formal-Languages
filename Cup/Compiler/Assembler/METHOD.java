package Assembler;

import java.util.*;

public class METHOD extends AssemblerCmd {
    private String       mName;
    private List<String> mArgList;

    public METHOD(String name, List<String> argList) {
        mName = name;
        mArgList = argList;
    }
    public String getName() {
        return mName;
    }
    public List<String> getArgList() {
        return mArgList;
    }
    public String toString() {
        String result = ".method " + mName + "(";
        for (int i = 0; i < mArgList.size(); ++i) {
            result += mArgList.get(i);
            if (i + 1 < mArgList.size()) {
                result += ", ";
            }
        }
        result += ")";
        return result;
    }
}

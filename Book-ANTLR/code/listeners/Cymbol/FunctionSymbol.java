import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    Scope enclosingScope;

    public FunctionSymbol(String name, Type retType, Scope enclosingScope) {
        super(name, retType);
        this.enclosingScope = enclosingScope;
    }
    public Symbol resolve(String name) {
        Symbol s = arguments.get(name);
        if (s != null) { return s; }
        // if not here, check any enclosing scope
        if (getEnclosingScope() != null) {
            return getEnclosingScope().resolve(name);
        }
        return null; // not found
    }
    public void define(Symbol sym) {
        arguments.put(sym.name, sym);
        sym.scope = this; // track the scope in each symbol
    }
    public Scope  getEnclosingScope() { return enclosingScope; }
    public String getScopeName() { return name; }

    public String toString() { return "function"+super.toString()+":"+arguments.values(); }
}

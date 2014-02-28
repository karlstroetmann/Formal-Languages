import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

public class CallGraph {
    /** A graph model of the output. Tracks call from one function to
     *  another by mapping function to list of called functions. E.g.,
     *  f -> [g, h]
     *  Can dump DOT two ways (StringBuilder and ST). Sample output:
         digraph G {
           ... setup ...
           f -> g;
           g -> f;
           g -> h;
           h -> h;
         }
     */
    static class Graph {
        Set<String>              mNodes = new OrderedHashSet<String>();   // list of functions
        MultiMap<String, String> edges = new MultiMap<String, String>(); // caller->callee
            
        public void edge(String source, String target) {
            edges.map(source, target);
        }
        public String toString() {
            return "edges: " + edges.toString() + ", functions: " + mNodes;
        }
        public String toDOT() {
            StringBuilder buf = new StringBuilder();
            buf.append("digraph G {\n");
            buf.append("  ranksep=.25;\n");
            buf.append("  edge [arrowsize=.5]\n");
            buf.append("  node [shape=circle, fontname=\"ArialNarrow\",\n");
            buf.append("        fontsize=12, fixedsize=true, height=.45];\n");
            buf.append("  ");
            for (String node: mNodes) { // print all nodes first
                buf.append(node);
                buf.append("; ");
            }
            buf.append("\n");
            for (String src: edges.keySet()) {
                for (String trg: edges.get(src)) {
                    buf.append("  ");
                    buf.append(src);
                    buf.append(" -> ");
                    buf.append(trg);
                    buf.append(";\n");
                }
            }
            buf.append("}\n");
            return buf.toString();
        }
    }
    static class FunctionListener extends CymbolBaseListener {
        Graph  graph               = new Graph();
        String currentFunctionName = null;

        public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            currentFunctionName = ctx.ID().getText();
            graph.mNodes.add(currentFunctionName);
        }
        public void exitCall(CymbolParser.CallContext ctx) {
            String funcName = ctx.ID().getText();
            // map current function to the callee
            graph.edge(currentFunctionName, funcName);
        }
    }
    public static void main(String[] args) throws Exception {
        String      inputFile = null;
        InputStream is        = System.in; 
	if (args.length > 0)   { inputFile = args[0];                 }
        if (inputFile != null) { is = new FileInputStream(inputFile); }
        ANTLRInputStream  input  = new ANTLRInputStream(is);
        CymbolLexer       lexer  = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser      parser = new CymbolParser(tokens);
        ParseTree         tree   = parser.file();
        ParseTreeWalker   walker = new ParseTreeWalker();
        FunctionListener  collector = new FunctionListener();
        walker.walk(collector, tree);
        // System.out.println(collector.graph.toString());
        System.out.println(collector.graph.toDOT());
    }
}

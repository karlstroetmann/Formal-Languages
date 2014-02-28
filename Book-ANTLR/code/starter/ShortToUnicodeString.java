/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class ShortToUnicodeString extends ArrayInitBaseListener {
    /** Translate { to " */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /** Translate } to " */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /** Translate integers to 4-digit hexadecimal strings prefixed with \\u */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        if (ctx.INT() != null) {
	    String s = ctx.INT().getText();
	    int value = Integer.valueOf(s);
	    System.out.printf("\\u%04x", value);
	} else {
	    System.out.print("(");
        }
    }
    public void exitValue(ArrayInitParser.ValueContext ctx) {
        if (ctx.init() != null) {
	    System.out.print(")");
        }
    }
}

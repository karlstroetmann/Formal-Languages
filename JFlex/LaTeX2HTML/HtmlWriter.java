public class HtmlWriter {
    public static void startHtml() {
	System.out.println("<!doctype html>");
	System.out.println("<html>");
	System.out.println("<head>");
	System.out.println("<script type=\"text/javascript\"");
        System.out.println("src=\"http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML\">");
	System.out.println("</script>");
	System.out.println("<body>");
    }
    public static void endHtml() {
	System.out.println("</body>");
	System.out.println("</html>");
    }
    public static void startMathBlock() {
	System.out.println("<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display='block'>");
    }
    public static void startMathInline() {
	System.out.println("<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display='inline'>");
    }
    public static void endMath() {
	System.out.println("</math>");
    }
    public static void startSum() {
	System.out.println("<munderover>");
	System.out.println("<mo>&sum;</mo>");
    }
    public static void endSum() {
	System.out.println("</munderover>");
    }
    public static void startSqrt() {
	System.out.println("<msqrt>");
    }
    public static void endSqrt() {
	System.out.println("</msqrt>");
    }
    public static void startSuper() {
	System.out.println("<msup>");
    }
    public static void endSuper() {
	System.out.println("</msup>");
    }
    public static void startFraction() {
	System.out.println("<mfrac>");
    }
    public static void endFraction() {
	System.out.println("</mfrac>");
    }
    public static void startRow() {
	System.out.println("<mrow>");
    }
    public static void endRow() {
	System.out.println("</mrow>");
    }
    public static void writeVar(String v) {
	System.out.print("<mi>" + v + "</mi>");
    }
    public static void writeNumber(String n) {
	System.out.print("<mn>" + n + "</mn>");
    }
    public static void writeTimes() {
	System.out.println("<mo>&sdot;</mo>");
    }
    public static void writeOperator(String op) {
	System.out.println("<mo>" + op + "</mo>");
    }
    public static void writePi() {
	System.out.println("<mn>&pi;</mn>");
    }
    public static void writeLeq() {
	System.out.println("<mo>&le;</mo>");
    }
    public static void writeGeq() {
	System.out.println("<mo>&ge;</mo>");
    }
    public static void errorMsg(String msg, int line, int column) {
	System.err.printf("unrecognized character '%s' in line %d, column %d",
			  msg, line + 1, column + 1);
    }
}

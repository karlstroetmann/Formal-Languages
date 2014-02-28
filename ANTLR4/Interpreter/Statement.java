public abstract class Statement {
    static boolean isInteractive = false;
    
    public abstract void execute();
    // indent gives the level of indentation
    public abstract String toString(int indent);

    static void prompt() {
        if (isInteractive) {
            System.out.print("SL> ");
            System.out.flush();
        }
    }
    String nBlanks(int n) {
        String result = "";
        for (int i = 0; i < n; ++i) {
            result += " ";
        }
        return result;
    }
}

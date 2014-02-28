public class Quit extends Statement {
    
    public Quit() {}
    public void execute() throws ReturnException {
        System.out.println("Good Bye!\n");
        System.exit(0);
    }
    public String toString() {
        return "quit;";        
    }
}
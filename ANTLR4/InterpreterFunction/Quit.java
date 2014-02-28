public class Quit extends Statement {
    
    public Quit() {}
    public void execute(Environment e) throws ReturnException {
        System.out.println("Good Bye!\n");
        System.exit(0);
    }
}
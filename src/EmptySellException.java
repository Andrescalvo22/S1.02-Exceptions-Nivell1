public class EmptySellException extends Exception{
    public EmptySellException(){
        super("To make a sell, first add some products");
    }
}

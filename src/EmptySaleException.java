public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sell, first add some products");
    }
}

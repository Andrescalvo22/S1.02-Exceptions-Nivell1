import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Sell sell1= new Sell();

        try {
        sell1.calculateTotal();
        }catch (EmptySellException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    Sell sell2= new Sell();

        sell2.AddProduct(new Product("Bread", 1.0));
        sell2.AddProduct(new Product("Corn", 1.5));

        try{
        sell2.calculateTotal();
        }catch (EmptySellException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
        List<String> list1= new ArrayList<>();
        list1.add("Element 1");
        try{
            System.out.println(list1.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
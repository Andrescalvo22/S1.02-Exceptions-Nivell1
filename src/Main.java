import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Sale sale1 = new Sale();

        try {
            sale1.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        Sale sale2 = new Sale();

        sale2.AddProduct(new Product("Bread", 1.0));
        sale2.AddProduct(new Product("Corn", 1.5));

        try {
            sale2.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        List<String> list1 = new ArrayList<>();
        list1.add("Element 1");
        try {
            System.out.println(list1.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
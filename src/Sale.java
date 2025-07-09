import java.util.ArrayList;
import java.util.List;

public class Sale {

    private final List<Product> products;
    private double totalPrice;

    public Sale(){
        products= new ArrayList();
        totalPrice= 0.0;

    }
    public void AddProduct(Product p){
        products.add(p);
    }
public void calculateTotal() throws EmptySaleException{
        if(products.isEmpty()){
            throw new EmptySaleException();
        }
totalPrice= 0;
        for(Product p : products) {
            totalPrice += p.getPrice();
        }
        System.out.println("The total price of the sell is: " + totalPrice + "€");
    }
}


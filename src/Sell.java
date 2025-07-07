import java.util.ArrayList;
import java.util.List;

public class Sell {

    private final List<Product> products;
    private double totalPrice;

    public Sell(){
        products= new ArrayList();
        totalPrice= 0.0;

    }
    public void AddProduct(Product p){
        products.add(p);
    }
public void calculateTotal() throws EmptySellException{
        if(products.isEmpty()){
            throw new EmptySellException();
        }
totalPrice= 0;
        for(Product p : products) {
            totalPrice += p.getPrice();
        }
        System.out.println("The total price of the sell is: " + totalPrice + "€");
    }
}


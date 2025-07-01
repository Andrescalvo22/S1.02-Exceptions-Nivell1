import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Venda venda1= new Venda();

        try {
        venda1.calcularTotal();
        }catch (VendaBuidaException e){
            System.out.println("Excepcio capturada: " + e.getMessage());
        }
    Venda venda2= new Venda();

        venda2.AffegirProducte(new Producte("Pa", 1.0));
        venda2.AffegirProducte(new Producte("Blat", 1.5));

        try{
        venda2.calcularTotal();
        }catch (VendaBuidaException e){
            System.out.println("Exceptio capturada: " + e.getMessage());
        }
        List<String> list1= new ArrayList<>();
        list1.add("Element 1");
        try{
            System.out.println(list1.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Excepcio capturada: " + e.getMessage());
        }
    }
}
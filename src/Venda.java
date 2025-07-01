import java.util.ArrayList;
import java.util.List;

public class Venda {

    private final List<Producte> productes;
    private double preuTotal;

    public Venda(){
        productes= new ArrayList();
        preuTotal= 0.0;

    }
    public void AffegirProducte(Producte p){
        productes.add(p);
    }
public void calcularTotal() throws VendaBuidaException{
        if(productes.isEmpty()){
            throw new VendaBuidaException();
        }
preuTotal= 0;
        for(Producte p : productes) {
            preuTotal += p.getPreu();
        }
        System.out.println("El preu total de la venda es: " + preuTotal + "€");
    }
}


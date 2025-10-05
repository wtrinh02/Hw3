package Builder;
import java.util.ArrayList;

public class Pizza {
    private String size;
    private ArrayList<String> toppings;
    private String chain;
    
    public Pizza(String size, ArrayList<String> toppings, String chain){
        this.size = size;
        this.toppings = toppings;
        this.chain=  chain;
    }


    public void eat(){
        String commaToppings = String.join(", ", toppings);
        System.out.println(chain + ": " + size + "-sized pizza. Toppings include " + commaToppings + ".");
    }
}

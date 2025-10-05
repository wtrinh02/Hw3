
import java.util.ArrayList;

public class PizzaBuilder {
    private String size;
    private ArrayList<String> toppings = new ArrayList<String>();
    private String chain;

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }

    public PizzaBuilder addToppings(String topping){
        this.toppings.add(topping);
        return this;
    }

    public Pizza createPizza(){
        return new Pizza(size,toppings,chain);
    }




}

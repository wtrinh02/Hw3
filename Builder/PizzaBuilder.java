package Builder;


public class PizzaBuilder {
    private String size;
    private String chain;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spickPork;
    private boolean hamAndPineapple;


    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }

    public PizzaBuilder addPepperoni(){
        this.pepperoni = true;
        return this;
    }
    
    public PizzaBuilder addSausage(){
        this.sausage = true;
        return this;
    }
    
    public PizzaBuilder addMushrooms(){
        this.mushrooms = true;
        return this;
    }
    
    public PizzaBuilder addBacon(){
        this.bacon = true;
        return this;
    }
    
    public PizzaBuilder addOnions(){
        this.onions = true;
        return this;
    }
    
    public PizzaBuilder addExtraCheese(){
        this.extraCheese = true;
        return this;
    }
    
    public PizzaBuilder addPeppers(){
        this.peppers = true;
        return this;
    }
    
    public PizzaBuilder addChicken(){
        this.chicken = true;
        return this;
    }
    
    public PizzaBuilder addOlives(){
        this.olives = true;
        return this;
    }
    
    public PizzaBuilder addSpinach(){
        this.spinach = true;
        return this;
    }
    
    public PizzaBuilder addTomatoAndBasil(){
        this.tomatoAndBasil = true;
        return this;
    }
    
    public PizzaBuilder addBeef(){
        this.beef = true;
        return this;
    }
    
    public PizzaBuilder addHam(){
        this.ham = true;
        return this;
    }
    
    public PizzaBuilder addPesto(){
        this.pesto = true;
        return this;
    }
    
    public PizzaBuilder addSpicyPork(){
        this.spickPork = true;
        return this;
    }
    
    public PizzaBuilder addHamAndPineapple(){
        this.hamAndPineapple = true;
        return this;
    }



    public Pizza createPizza(){
        return new Pizza(size,chain,pepperoni,sausage,mushrooms,bacon,onions,extraCheese,peppers,chicken,olives,spinach,
                tomatoAndBasil,beef,ham,pesto,spickPork,hamAndPineapple);
    }




}

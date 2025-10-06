package Builder;


public class Pizza {

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


    
    public Pizza(String size, String chain, boolean hasPepperoni, boolean hasSausage, boolean hasMushrooms, boolean hasBacon, boolean hasOnions, 
                boolean hasExtraCheese,boolean hasPeppers, boolean hasChicken, boolean hasOlives, boolean hasSpinach, boolean hasTomatoAndBasil, 
                boolean hasBeef, boolean hasHam, boolean hasPesto, boolean hasSpicyPork, boolean hasHamAndPineapple){
        
        this.size = size;
        this.chain=  chain;
        this.pepperoni = hasPepperoni;
        this.sausage = hasSausage;
        this.mushrooms = hasMushrooms;
        this.bacon = hasBacon;
        this.onions = hasOnions;
        this.extraCheese = hasExtraCheese;
        this.peppers = hasPeppers;
        this.chicken = hasChicken;
        this.olives = hasOlives;
        this.spinach = hasSpinach;
        this.tomatoAndBasil = hasTomatoAndBasil;
        this.beef = hasBeef;
        this.ham = hasHam;
        this.pesto = hasPesto;
        this.spickPork = hasSpicyPork;
        this.hamAndPineapple = hasHamAndPineapple;
    }


    public void eat(){

        StringBuilder toppings = new StringBuilder();

        if(pepperoni) toppings.append("Pepperoni, ");
        if(sausage) toppings.append("Sausage, ");
        if(mushrooms) toppings.append("Mushrooms, ");
        if(bacon) toppings.append("Bacon, ");
        if(onions) toppings.append("Onions, ");
        if(extraCheese) toppings.append("Extra Cheese, ");
        if(peppers) toppings.append("Peppers, ");
        if(chicken) toppings.append("Chicken, ");
        if(olives) toppings.append("Olives, ");
        if(spinach) toppings.append("Spinach, ");
        if(tomatoAndBasil) toppings.append("Tomato and Basil, ");
        if(beef) toppings.append("Beef, ");
        if(ham) toppings.append("Ham, ");
        if(pesto) toppings.append("Pesto, ");
        if(spickPork) toppings.append("Spicy Pork, ");
        if(hamAndPineapple) toppings.append("Ham and Pineapple, ");

        if (toppings.length() > 0){
            toppings.setLength(toppings.length() - 2);
        }

        System.out.println(chain + ": " + size + "-sized pizza. Chosen Toppings: " + toppings.toString());
    }
}

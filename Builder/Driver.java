package Builder;
public class Driver {
    
    public static void main (String args[]){


        //Part 1
        Pizza smallPizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addPepperoni().addBacon().addSausage().createPizza();
        Pizza mediumPizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Medium").addBeef().addBacon().addChicken().addExtraCheese()
            .addOlives().addOnions().createPizza();
        Pizza largePizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addHamAndPineapple().addSpicyPork().addPesto()
            .addPeppers().addChicken().addSpinach().addTomatoAndBasil().addOlives().addBacon().createPizza();

        smallPizza.eat();
        mediumPizza.eat();
        largePizza.eat();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        //Part 2
        Pizza hutLargePizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addChicken().addHamAndPineapple().addExtraCheese().createPizza();
        Pizza hutSmallPizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addBeef().addPeppers().createPizza();

        Pizza caesarsMediumPizza = new PizzaBuilder().setChain("Little Caesars").setSize("Medium").addSausage().addBacon().addBeef().addPepperoni().addChicken()
            .addHam().addSpicyPork().addExtraCheese().createPizza();
        Pizza caesarsSmallPizza =  new PizzaBuilder().setChain("Little Caesars").setSize("Small").addOnions().addMushrooms().addPeppers().addOlives().addSpinach()
            .addTomatoAndBasil().createPizza();
        
        Pizza dominosSmallPizza = new PizzaBuilder().setChain("Dominos").setSize("Small").addExtraCheese().createPizza();
        Pizza dominosLargePizza = new PizzaBuilder().setChain("Dominos").setSize("Large").addChicken().addPeppers().addHam().createPizza();

        hutLargePizza.eat();
        hutSmallPizza.eat();
        caesarsMediumPizza.eat();
        caesarsSmallPizza.eat();
        dominosSmallPizza.eat();
        dominosLargePizza.eat();


    }
}

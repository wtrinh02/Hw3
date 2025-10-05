package Builder;
public class Driver {
    
    public static void main (String args[]){


        //Part 1
        Pizza smallPizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addToppings("Pepperoni").addToppings("Sausage").addToppings("Mushrooms").createPizza();
        Pizza mediumPizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Medium").addToppings("Pepperoni").addToppings("Bacon").addToppings("Peppers").addToppings("Onions").addToppings("Spinach").addToppings("Ham").createPizza();
        Pizza largePizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addToppings("Sausage").addToppings("Bacon").addToppings("Peppers").addToppings("Onions").addToppings("Mushrooms").addToppings("Ham").addToppings("Spicy Pork").addToppings("Pesto").addToppings("Beef").createPizza();
        smallPizza.eat();
        mediumPizza.eat();
        largePizza.eat();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        //Part 2
        Pizza hutLargePizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addToppings("Chicken").addToppings("Ham and Pineapple").addToppings("Extra Cheese").createPizza();
        Pizza hutSmallPizza = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addToppings("Beef").addToppings("Peppers").createPizza();

        Pizza caesarsMediumPizza = new PizzaBuilder().setChain("Little Caesars").setSize("Medium").addToppings("Sausage").addToppings("Bacon").addToppings("Beef").addToppings("Pepperoni").addToppings("Chicken").addToppings("Ham").addToppings("Spicy Pork").addToppings("Extra Cheese").createPizza();
        Pizza caesarsSmallPizza =  new PizzaBuilder().setChain("Little Caesars").setSize("Small").addToppings("Onions").addToppings("Mushrooms").addToppings("Peppers").addToppings("Olives").addToppings("Spinach").addToppings("Tomato and Basil").createPizza();
        
        Pizza dominosSmallPizza = new PizzaBuilder().setChain("Dominos").setSize("Small").addToppings("Extra Cheese").createPizza();
        Pizza dominosLargePizza = new PizzaBuilder().setChain("Dominos").setSize("Large").addToppings("Chicken").addToppings("Peppers").addToppings("Ham").createPizza();

        hutLargePizza.eat();
        hutSmallPizza.eat();
        caesarsMediumPizza.eat();
        caesarsSmallPizza.eat();
        dominosSmallPizza.eat();
        dominosLargePizza.eat();


    }
}

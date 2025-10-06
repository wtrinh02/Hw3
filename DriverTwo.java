


public class DriverTwo {
    
    public static void main (String args[]){
        
        String noRestriction = "No Restriction";
        String paleo = "Paleo";
        String vegan = "Vegan";
        String nutAllergy = "Nut Allergy";

        Customer bobby = new Customer("Bobby", noRestriction);
        Customer kevin = new Customer("Kevin", paleo);
        Customer chris = new Customer("Chris", vegan);
        Customer tyler = new Customer("Tyler", nutAllergy);
        Customer nolan = new Customer("Nolan", paleo);
        Customer phillip = new Customer("Phillip", vegan);

        FactoryCreator mealCreator = FactoryCreator.getInstance();
        mealCreator.createMealPlan(bobby.getName(), bobby.dietPlan);
        mealCreator.createMealPlan(kevin.getName(), kevin.dietPlan);
        mealCreator.createMealPlan(chris.getName(), chris.dietPlan);
        mealCreator.createMealPlan(tyler.getName(), tyler.dietPlan);
        mealCreator.createMealPlan(nolan.getName(), nolan.dietPlan);
        mealCreator.createMealPlan(phillip.getName(), phillip.dietPlan);


    }
}

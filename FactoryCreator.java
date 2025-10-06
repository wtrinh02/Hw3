public class FactoryCreator {
    
    private static FactoryCreator instance;

    private FactoryCreator(){}

    public static FactoryCreator getInstance(){
        if(instance == null){
            instance = new FactoryCreator();
        }
        return instance;
    }

    public void createMealPlan(String name, String dietPlan){
        String carb =  CarbsFactory.getInstance().chooseCarb(dietPlan).getCarb();
        String protein = ProteinFactory.getInstance().chooseProtein(dietPlan).getProtein();
        String fat = FatFactory.getInstance().chooseFats(dietPlan).getFat();

        System.out.println(dietPlan+ " meal Plan for " + name +" is : " + carb + ", " + protein + ", " + fat + ".");
 
    }
    
}

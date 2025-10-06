
import java.util.ArrayList;
import java.util.Random;

import Factory.Carbs.*;
import Factory.Fats.Fats;
import Factory.Proteins.Protein;



public class CarbsFactory extends MacronutrientsFactory{

    private static CarbsFactory instance;

    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if (instance == null){
            instance = new CarbsFactory();
        }
        return instance;
    }

    public Carbs chooseCarb(String DietPlan) {

        ArrayList<Carbs> carbs = new ArrayList<>();
        if(DietPlan.equals("Paleo")){
            carbs.add(new Pistachios());
        }
        else{
            carbs.add(new Bread());
            carbs.add(new Lentils());
            if(!"Vegan".equals(DietPlan)){
                carbs.add(new Cheese());
            }
            if(!"Nut Allergy".equals(DietPlan)){
                carbs.add(new Pistachios());
            }
        }
        Random random = new Random();

        return carbs.get(random.nextInt(carbs.size()));
    }


    public Protein chooseProtein(String dietPlan) {
        return null;
    }

    public Fats chooseFats(String dietPlan) {
        return null;
    }
    
}

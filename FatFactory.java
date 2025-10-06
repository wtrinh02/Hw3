
import java.util.ArrayList;
import java.util.Random;

import Factory.Carbs.Carbs;
import Factory.Fats.*;
import Factory.Proteins.Protein;



public class FatFactory extends MacronutrientsFactory{
    
    private static FatFactory instance;

    private FatFactory(){}

    public static FatFactory getInstance(){
        if (instance == null){
            instance = new FatFactory();
        }
        return instance;
    }

    
    public Fats chooseFats(String DietPlan) {

        ArrayList<Fats> fats = new ArrayList<>();
        if(!"Nut Allergy".equals(DietPlan)){
             fats.add(new Peanuts());
        }
        if(!"Vegan".equals(DietPlan) && !"Paleo".equals(DietPlan)){
            fats.add(new SourCream());

        fats.add(new Avacado());
        fats.add(new Tuna());

            
        }
        Random random = new Random();

        return  fats.get(random.nextInt(fats.size()));
    }


    public Carbs chooseCarb(String dietPlan) {
        return null;
    }

    public Protein chooseProtein(String dietPlan) {
        return null;
    }
}

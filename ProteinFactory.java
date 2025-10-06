
import java.util.ArrayList;
import java.util.Random;

import Factory.Carbs.Carbs;
import Factory.Fats.Fats;
import Factory.Proteins.*;

public class ProteinFactory extends MacronutrientsFactory{
        private static ProteinFactory instance;

    private ProteinFactory(){}

    public static ProteinFactory getInstance(){
        if (instance == null){
            instance = new ProteinFactory();
        }
        return instance;
    }

    
    public Protein chooseProtein(String DietPlan) {

        ArrayList<Protein>  proteins = new ArrayList<>();
        if("Vegan".equals(DietPlan)){
              proteins.add(new Tofu());
        }
        else{
        
            proteins.add(new Fish());
            proteins.add(new Chicken());
            proteins.add(new Beef());
            if(!"Paleo".equals(DietPlan)){
                proteins.add(new Tofu());
            }

            
        }
        Random random = new Random();

        return   proteins.get(random.nextInt( proteins.size()));
    }


    public Carbs chooseCarb(String dietPlan) {
        return null;
    }

    public Fats chooseFats(String dietPlan) {
        return null;
    }
}

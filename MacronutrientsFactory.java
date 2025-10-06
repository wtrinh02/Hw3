

import Factory.Proteins.*;
import Factory.Carbs.*;
import Factory.Fats.*;

public abstract class MacronutrientsFactory {

    public abstract Carbs chooseCarb(String dietPlan);
    public abstract Protein chooseProtein(String dietPlan);
    public abstract Fats chooseFats(String dietPlan);
}

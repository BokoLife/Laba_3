package Objects;
import Persons.*;

public class OatMeal {
    private boolean eatOatmeal;

    public void oatmealCheck(Visitor neznaika){
        if (neznaika.getHoursOfSleep() <= 10){
            System.out.println(neznaika.getName() + " поел кашу с утра, он полон сил!!");
            eatOatmeal = true;
        }
        else {
            System.out.println(neznaika.getName() + " не успел поесть кашу утром, поднять халат он не в силах");
            System.out.println("Миссия провалена...");
            eatOatmeal = false;
        }

    }

    public boolean isEatOatmeal() {
        return eatOatmeal;
    }
    public void setEatOatmeal(boolean eatOatmeal) {
        this.eatOatmeal = eatOatmeal;
    }

}

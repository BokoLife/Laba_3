package Objects.Clothes;
import Objects.*;
import Persons.*;

public class Glasses extends Things implements Wearable {
    private int num;


    public void stayGlassesCheck(Visitor neznaika, Doctor medunica){
        if (neznaika.isStayGlasses()){
            this.see(medunica);
            this.wear(neznaika);
        }
        else System.out.println("Миссия провалена...");
    }


    @Override
    public void see(Person person) {
        System.out.println(person.getName() + " оставила на столе очки");
    }
    @Override
    public void take(Person person) {

    }
    @Override
    public void wear(Person person) {
        System.out.println(person.getName() + " нацепил их на нос");
    }
}

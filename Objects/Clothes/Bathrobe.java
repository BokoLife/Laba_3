package Objects.Clothes;
import Persons.*;

public class Bathrobe extends Clothes {
    private boolean sizeCheck;
    private ClothesActions bathrobeAction;
    private final ClothesColor bathrobeColor;

    public Bathrobe(Doctor medunica, ClothesColor bathrobeColor){
        this.setSize(medunica.getHeight());
        this.bathrobeColor = bathrobeColor;
    }
    public void sizeCheck(Visitor neznaika){
        if (neznaika.getHeight() - this.getSize() > 10) {
            System.out.println("Халатик маловат...");
            System.out.println("Миссия провалена...");
            sizeCheck = false;
        }
        else {
            this.wear(neznaika);
            sizeCheck = true;
        }
    }
    public String getColor(){
        return bathrobeColor.getColor();
    }


    @Override
    public void see(Person person){
        bathrobeAction = ClothesActions.SEE;
        System.out.println(person.getName() + " " + bathrobeAction.getAction() + " " + this.bathrobeColor.getColor() +" халат");
    }
    @Override
    public void take(Person person){
        bathrobeAction = ClothesActions.TAKE;
        System.out.println(person.getName() + " " + bathrobeAction.getAction() + " " + this.bathrobeColor.getColor() +" халат");
    }
    @Override
    public void wear(Person person){
        bathrobeAction = ClothesActions.WEAR;
        System.out.println(person.getName() + " " + bathrobeAction.getAction() + " " + this.bathrobeColor.getColor() +" халат");
    }

    public boolean isSizeCheck() {
        return sizeCheck;
    }
    public void setSizeCheck(boolean sizeCheck) {
        this.sizeCheck = sizeCheck;
    }
}

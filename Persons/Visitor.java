package Persons;

import Objects.*;
import Objects.Clothes.*;

public class Visitor extends Person{
    private int hoursOfSleep;
    private int height;
    private boolean eatOatmeal;
    private boolean bathrobeSizeCheck;
    private boolean stayGlasses;
    private Sleep sleep;
    private OatMeal oatMeal;
    private Bathrobe bathrobe;
    private Cap cap;
    private Glasses glasses;
    private ClothesType clothesType;

    public Visitor(String name, int height, int hoursOfSleep, Bathrobe bathrobe){
        this.setName(name);
        this.setHoursOfSleep(hoursOfSleep);
        this.setHeight(height);
        this.sleep = new Sleep(hoursOfSleep);
        this.oatMeal = new OatMeal();
        this.bathrobe = bathrobe;
        this.cap = new Cap();
        this.glasses = new Glasses();
    }

    public Visitor(String name) {
        this.setName(name);
    }

    public void setHoursOfSleep(int hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }
    public int getHoursOfSleep() {
        return hoursOfSleep;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }


    public void sleepCheck(){
        sleep.sleepCheck(this);
        if (sleep.isSleepCheck()) {
            bathrobe.see(this);
        }
    }


    public void oatmealCheck(){
        if (sleep.isSleepCheck()) oatMeal.oatmealCheck(this);
        if (oatMeal.isEatOatmeal()) {
            bathrobe.take(this);
            this.setEatOatmeal(true);
        }
    }
    public void setEatOatmeal(boolean eatOatmeal) {
        this.eatOatmeal = eatOatmeal;
    }
    public boolean isEatOatmeal() {
        return eatOatmeal;
    }


    public void bathrobeSizeCheck(){
         if (sleep.isSleepCheck() && oatMeal.isEatOatmeal()) {
             bathrobe.sizeCheck(this);
             bathrobeSizeCheck = bathrobe.isSizeCheck();
         }
    }
    public boolean isBathrobeSizeCheck() {
        return bathrobeSizeCheck;
    }
    public void setBathrobeSizeCheck(boolean bathrobeSizeCheck) {
        this.bathrobeSizeCheck = bathrobeSizeCheck;
    }


    public void wearCap(){
        this.cap.wear(this);
    }

    public void stayGlassesCheck(Doctor doctor){
        this.setStayGlasses(true);
        this.glasses.stayGlassesCheck(this, doctor);
    }
    public boolean isStayGlasses() {
        return stayGlasses;
    }
    public void setStayGlasses(boolean stayGlasses) {
        this.stayGlasses = stayGlasses;
    }


    public void wear(ClothesType clothesType){
        this.clothesType = clothesType;
        System.out.println(this.getName() + " " + clothesType.wear());
    }

    @Override
    public void speak(){
    }
    @Override
    public void showInfo(){
        System.out.println("Имя:" + this.getName() + "  Рост:" + this.getHeight());
    }
    @Override
    public void goAwayFromRoom(){
        System.out.println(this.getName() + " вышел из комнаты");
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.getHoursOfSleep();
        result = 31 * result + this.getHeight();
        result = 31 * result + ((this.getName() == null) ? 0 : this.getName().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Visitor other = (Visitor) obj;
        return (this.getName() == other.getName() || (this.getName() != null && this.getName().equals(other.getName())))  &&  (this.getHeight() == other.getHeight())  &&  (this.getHoursOfSleep() == other.getHoursOfSleep());
    }
}

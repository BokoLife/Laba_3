package Persons;

import Objects.Clothes.*;

public class Visitor extends Person{
    private int hoursOfSleep;
    private int height;

    public Visitor(String name, int height, int hoursOfSleep){
        this.setName(name);
        this.setHoursOfSleep(hoursOfSleep);
        this.setHeight(height);
    }
    public Visitor(String name) {
        this.setName(name);
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public boolean sleepCheck(){
        return getHoursOfSleep() >= 8;
    }
    public void setHoursOfSleep(int hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }
    public int getHoursOfSleep() {
        return hoursOfSleep;
    }

    public boolean oatmealCheck() {
        return getHoursOfSleep() <= 10;
    }

    public boolean clothesSizeCheck(Doctor doc){
        return getHeight() - doc.getHeight() <= 10;
    }

    public void missionFailed(){
        System.out.println("Миссия провалена...");
    }

    public void see(ClothesType clothes){
        System.out.println(this.getName() + " " + clothes.see());
    }
    public void take(ClothesType clothes){
        System.out.println(this.getName() + " " + clothes.take());
    }
    public void wear(ClothesType clothes){
        System.out.println(this.getName() + " " + clothes.wear());
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

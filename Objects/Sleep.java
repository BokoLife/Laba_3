package Objects;

import Persons.*;

public class Sleep{
    private int hours;
    boolean sleepCheck;

    public Sleep(int hours){
        this.hours = hours;
    }

    public void sleepCheck(Person neznaika){
        if (this.hours < 8){
            System.out.println(neznaika.getName() + " не выспался, его глаза нуждаются в отдыхе");
            System.out.println("Миссия провалена...");
            sleepCheck = false;
        }
        else {
            sleepCheck = true;
        }
    }


    public boolean isSleepCheck() {
        return sleepCheck;
    }
    public void setSleepCheck(boolean sleepCheck) {
        this.sleepCheck = sleepCheck;
    }


    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
}

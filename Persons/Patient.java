package Persons;

public class Patient extends Person{
    private int daysFromCrash;

    public Patient(String name, int daysFromCrash){
        this.setName(name);
        this.daysFromCrash = daysFromCrash;
    }

    public void setDaysFromCrash(int daysFromCrash) {
        this.daysFromCrash = daysFromCrash;
    }
    public int getDaysFromCrash(){
        return daysFromCrash;
    }


    @Override
    public void speak(){
    }
    @Override
    public void showInfo(){
        System.out.println("Имя: " + this.getName() + "Прошло дней после получения раны: " + this.getDaysFromCrash());
    }
    @Override
    public void goAwayFromRoom(){
        System.out.println(this.getName() + " вышла из комнаты");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Patient other = (Patient) obj;
        return (this.getName() == other.getName() || (this.getName() != null && this.getName().equals(other.getName()))) && this.getDaysFromCrash() == other.getDaysFromCrash();
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.getDaysFromCrash();
        result = 31 * result + ((this.getName() == null) ? 0 : this.getName().hashCode());
        return result;
    }
}

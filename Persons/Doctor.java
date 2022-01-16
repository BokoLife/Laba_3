package Persons;

public class Doctor extends Person{
    private int age;
    private double vision;
    private boolean stayGlasses;
    private boolean isCheckRecovery;

    public Doctor(String name, int height, int age, double vision){
        this.setName(name);
        this.setHeight(height);
        this.setAge(age);
        this.setVision(vision);
    }

    public void watchSore(Patient patient){
        System.out.println(this.getName() + " начала осмотр раны " + patient.getName());  //Сделать правильное окончание
    }
    public void removePatch(){
        System.out.println(this.getName() + " сорвала пластырь ");
    }

    public boolean checkRecovery(Patient patient){
        return patient.getDaysFromCrash() < 10;
    }
    public boolean isCheckRecovery() {
        return isCheckRecovery;
    }
    public void setIsCheckRecovery(boolean checkRecovery) {
        this.isCheckRecovery = checkRecovery;
    }

    public boolean stayGlassesCheck(){
        return this.getAge() > 60;
    }
    public void setStayGlasses(boolean stayGlasses) {
        this.stayGlasses = stayGlasses;
    }
    public boolean isStayGlasses() {
        return stayGlasses;
    }

    public boolean checkVision(){
        return this.getVision() > -2 && this.getVision() < 3;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setVision(double vision) {
        this.vision = vision;
    }
    public double getVision() {
        return vision;
    }

    @Override
    public void speak(){
    }
    @Override
    public void showInfo(){
        System.out.println("Имя:" + this.getName() + "  Рост:" + this.getHeight() + "  Оставила очки:" + this.isStayGlasses());
    }
    @Override
    public void goAwayFromRoom(){
        System.out.println(this.getName() + " вышла из комнаты");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Doctor other = (Doctor) obj;
        return (this.getName() == other.getName() || (this.getName() != null && this.getName().equals(other.getName())))  &&  (this.getHeight() == other.getHeight())  &&  (this.getAge() == other.getAge());
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.getAge();
        result = 31 * result + this.getHeight();
        result = 31 * result + ((this.getName() == null) ? 0 : this.getName().hashCode());
        return result;
    }
}

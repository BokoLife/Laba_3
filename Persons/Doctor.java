package Persons;

public class Doctor extends Person{
    private int age;
    private boolean stayGlasses;
    private boolean checkRecovery;

    public Doctor(String name, int height, int age){
        this.setName(name);
        this.setHeight(height);
        this.setAge(age);
    }

    public void watchSore(Patient patient){
        System.out.println(this.getName() + " начала осмотр раны " + patient.getName());  //Сделать правильное окончание
    }
    public void removePatch(){
        System.out.println(this.getName() + " сорвала пластырь ");
    }
    public void checkRecovery(Patient patient){
        if (patient.getDaysFromCrash() < 10){
            System.out.println("Рана ещё не зажила, пойдёмте со мной, мы погреем ваш лоб синим светом, чтобы не было синяка");
            checkRecovery = true;
            this.goAwayFromRoom();
            patient.goAwayFromRoom();
        }
        else{
            System.out.println("Рана зажила, пластырь можно больше не носить");
            System.out.println("Миссия провалена...");
            checkRecovery = false;
        }
    }

    public boolean isCheckRecovery() {
        return checkRecovery;
    }
    public void setCheckRecovery(boolean checkRecovery) {
        this.checkRecovery = checkRecovery;
    }

    public boolean stayGlassesCheck(){
        if (this.getAge() > 60){
            this.setStayGlasses(true);
            return true;
        }
        else return false;
    }
    public void stayGlasses(){
    }
    public void setStayGlasses(boolean stayGlasses) {
        this.stayGlasses = stayGlasses;
    }
    public boolean isStayGlasses() {
        return stayGlasses;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
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

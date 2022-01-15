package Persons;

public abstract class Person implements Walkable{
    private String name;
    private int height;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public abstract void goAwayFromRoom();

    //@Override
    public void showInfo(){
        System.out.println("Имя: " + this.name);
    }
    //@Override
    public abstract void speak();

    @Override
    public String toString(){
        return "Имя: " + this.getName();
    }
}

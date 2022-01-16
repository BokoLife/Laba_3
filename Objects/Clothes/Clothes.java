package Objects.Clothes;

public class Clothes implements Wearable {
    private int size;
    private boolean sizeCheck;

//    public void see(Person person);
//    public void take(Person person);
//    public void wear(Person person);

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Clothes other = (Clothes) obj;
        return (this.getSize() == other.getSize());
    }
    @Override
    public int hashCode(){
        int result = 1;
        result = 31 * result + this.getSize();
        return result;
    }
    @Override
    public String toString(){
        return "Размер: " + this.getSize() + "   Класс: " + this.getClass();
    }
}

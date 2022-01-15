package Objects.Clothes;

public enum ClothesColor {
    WHITE ("белый"), BLUE("синий"), RED("красный");
    private final String color;

    ClothesColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}

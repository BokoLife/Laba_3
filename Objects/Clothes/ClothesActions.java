package Objects.Clothes;

public enum ClothesActions {
    SEE("увидел"), TAKE("взял"), WEAR("надел"), REMOVE("снял");

    private final String action;

    ClothesActions(String action){
        this.action = action;
    }
    public String getAction(){
        return action;
    }
}

package Objects.Clothes;
import Objects.Clothes.ClothesType;

public enum ClothesType {
    CAP("колпак"){
        @Override
        public String wear(){
            return "напялил " + this.getClothes();
        }
    },
    BATHROBE("халат"),
    GLASSES("очки");

    private String clothes;

    ClothesType(String clothes){
        this.clothes = clothes;
    }
    ClothesType(String clothes, ClothesType clothesType){
        
    }

    public String wear(){
        return "надел " + this.clothes;
    }

    public String getClothes(){
        return clothes;
    }
}

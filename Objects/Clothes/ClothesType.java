package Objects.Clothes;
import Objects.Clothes.ClothesColor;

public enum ClothesType {
    CAP("колпак"){
        @Override
        public String wear(){
            return "напялил " + this.getClothes();
        }
    },
    BATHROBE("халат"){
        ClothesColor color = ClothesColor.WHITE;
        @Override
        public String wear(){
            return "надел" + " " + color.getColor() + " " + this.getClothes();
        }
        public String see(){
            return "увидел" + " " + color.getColor() + " " + this.getClothes();
        }
        public String take(){
            return "взял" + " " + color.getColor() + " " + this.getClothes();
        }
    },
    GLASSES("очки"){
        @Override
        public String wear(){
            return "нацепил " + this.getClothes();
        }
    },
    TUBE("палочка"){
        public String take(){
            return "взял палочку";
        }
    };

    private String clothes;
    private int size;
    private ClothesColor clothesColor;

    ClothesType(String clothes){
        this.clothes = clothes;
    }
//    ClothesType(String clothes){
//        this.clothes = clothes;
//        this.size = size;
//        //this.clothesColor = clothesColor;
//    }

    public String see(){
        return "увидел" + " " + this.clothes;
    }
    public String take(){
        return "взял" + " " + this.clothes;
    }
    public String wear(){
        return "надел" + " " + this.clothes;
    }

    public String getClothes(){
        return clothes;
    }
}

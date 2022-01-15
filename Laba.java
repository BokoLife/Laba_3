import Objects.Clothes.*;
import Persons.*;

public class Laba {
    public static void main(String[] args){
        Patient sineglazka = new Patient("Синеглазка",5);  //  дни 10
        Doctor medunica = new Doctor("Медуница", 155, 61);              // рост 10 возраст 60
        Bathrobe bathrobe = new Bathrobe(medunica, ClothesColor.RED);
        //Sleep sleep = new Sleep(8); //DIP

        Visitor neznaika = new Visitor("Незнайка", 160, 8, bathrobe);    // hOS > 8
        Visitor snezhinka = new Visitor("Снежинка");
        neznaika.wear(ClothesType.BATHROBE);

        medunica.watchSore(sineglazka);
        medunica.removePatch();
        medunica.checkRecovery(sineglazka);
        if (medunica.isCheckRecovery()) {
            neznaika.sleepCheck();
            neznaika.oatmealCheck();
            neznaika.bathrobeSizeCheck();
            if (neznaika.isBathrobeSizeCheck()){
                //neznaika.wearCap();
                neznaika.wear(ClothesType.CAP);
                if (medunica.stayGlassesCheck()){
                    neznaika.stayGlassesCheck(medunica);
                    neznaika.goAwayFromRoom();
                    snezhinka.speak();
                }
            }
        }

        //Scene scene = new Scene();
        //scene.startScene(sineglazka, medunica, neznaika, snezhinka);
    }
}

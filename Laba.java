import Objects.Clothes.*;
import Persons.*;

public class Laba {
    public static void main(String[] args){
        Patient sineglazka = new Patient("Синеглазка",5);  // days > 10
        Doctor medunica = new Doctor("Медуница", 155, 61, 2); //height => 10; age < 60; -2 < vision < 3

        Visitor neznaika = new Visitor("Ненайка", 160, 10); // 12 <= hOS => 8
        Visitor snezhinka = new Visitor("Снежинка");

        System.out.println(neznaika.getName() + " хочет пробраться в палату к малышу, минуя доктора");

        medunica.watchSore(sineglazka);
        medunica.removePatch();
        boolean checker = true;
        if (medunica.checkRecovery(sineglazka)){
            System.out.println("Рана ещё не зажила, пойдёмте со мной, мы погреем ваш лоб синим светом, чтобы не было синяка");
            medunica.goAwayFromRoom();
            sineglazka.goAwayFromRoom();
        }
        else {
            System.out.println("Рана зажила, пластырь можно больше не носить");
            System.out.println(medunica.getName() + " и " + snezhinka.getName() + " остались в комнате");
            neznaika.missionFailed();
            checker = false;
        }

        if (checker && neznaika.sleepCheck()){
            neznaika.see(ClothesType.BATHROBE);
            neznaika.see(ClothesType.CAP);
        }
        else if (checker && !neznaika.sleepCheck()){
            System.out.println(neznaika.getName() + " не выспался, он плохо различает предметы, его глаза нуждаются в отдыхе!");
            neznaika.missionFailed();
            checker = false;
        }

        if (checker && neznaika.oatmealCheck()){
            System.out.println("Недолго думая");
        }
        else if (checker && !(neznaika.oatmealCheck())){
            System.out.println(neznaika.getName() + " не успел поесть кашу утром, поэтому он заторможен сегодня");
            neznaika.missionFailed();
            checker = false;
        }

        if (checker && neznaika.clothesSizeCheck(medunica)){
            neznaika.wear(ClothesType.BATHROBE);
            neznaika.wear(ClothesType.CAP);
            if (medunica.stayGlassesCheck()){
                neznaika.wear(ClothesType.GLASSES);
                if (medunica.checkVision()){
                    neznaika.take(ClothesType.TUBE);
                }
                else{
                    System.out.println("У " + medunica.getName() + " очень плохое зрение, " + "у " + neznaika.getName() + " заболела голова");
                    checker = false;
                    neznaika.missionFailed();
                }
            }
            else{
                System.out.println(medunica.getName() + " " + "не оставила очки");
                neznaika.missionFailed();
                checker = false;
            }
        }
        else if (checker && !neznaika.clothesSizeCheck(medunica)){
            System.out.println("Подождите-ка");
            System.out.println("А халатик то маловат");
            System.out.println("Миссия провалена...");
            checker = false;
        }

        if (checker){
            neznaika.goAwayFromRoom();
            System.out.println(snezhinka.getName() + " удивилась его находчивости и смелости");
        }
    }
}

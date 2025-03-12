import prikazy.Batoh;
import prikazy.Predmet;
import prikazy.TypPredmetu;
import world.WorldMap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Konzole k = new Konzole();
        Batoh b = new Batoh();
        b.pridani(new Predmet("mec",10,2, TypPredmetu.MEC));
        b.pridani(new Predmet("heal",1,TypPredmetu.LEKTVARHEAL,10));

        k.start();






    }
}
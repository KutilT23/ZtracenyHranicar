import prikazy.Batoh;
import prikazy.Predmet;
import prikazy.Shop;
import prikazy.TypPredmetu;
import world.WorldMap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Konzole k = new Konzole();
        Shop shop = new Shop();
        shop.obchodovani();
        shop.pridatVeci();
        shop.nakup();
        shop.nakup();


      //  k.start();

        System.out.println(shop.prodej());
        System.out.println(shop.prodej());



    }
}
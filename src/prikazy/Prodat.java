package prikazy;

import dalsi.Shop;
import world.Command;
import world.WorldMap;

public class Prodat extends Command {
    /**
     * metoda na spusteni metody na prodej
     */
    @Override
    public String execute() {
        WorldMap wm = new WorldMap();
        int aktualniPozice = wm.getCurrentPosition();


        if(aktualniPozice==1){
            Shop shop = new Shop();
            shop.pridatVeci();
            System.out.println(shop.prodej());
        }else{
            return "nejsi ve vesnici";
        }

        return "";
    }
    /**
     * metoda na zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return false;
    }
}

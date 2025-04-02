package prikazy;

import dalsi.Shop;
import world.Command;
import world.WorldMap;

/**
 * Třída na nákup předmětů
 */
public class Nakup extends Command {
    /**
     *  spusteni metod na pridani predmetu do shopu a jejich nasledný nakup
     */
    @Override
    public String execute() {
        WorldMap wm = new WorldMap();
        int aktualniPozice = wm.getCurrentPosition();

        if(aktualniPozice==1){
            Shop shop = new Shop();
            shop.pridatVeci();
            shop.nakup();
        }else{
            return "nejsi ve vesnici";
        }
        return "";
    }

    /**
     * metoda na zjisteni zda program končí
     */
    @Override
    public boolean exit() {
        return false;
    }
}

package prikazy;

import world.WorldMap;

public class Nakup extends Command{
    @Override
    public String execute() {
        WorldMap wm = new WorldMap();
        int aktualniPozice = wm.getCurrentPosition();
        // System.out.println("Aktuální pozice: " + aktualniPozice);

        if(aktualniPozice==1){
            Shop shop = new Shop();
            shop.pridatVeci();
            shop.nakup();
        }else{
            System.out.println("Nejsi ve vesnici");
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

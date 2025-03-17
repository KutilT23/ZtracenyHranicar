package prikazy;

import world.WorldMap;

public class Prodat extends Command{
    @Override
    public String execute() {
        WorldMap wm = new WorldMap();
        int aktualniPozice = wm.getCurrentPosition();
        System.out.println("Aktuální pozice: " + aktualniPozice);

        if(aktualniPozice==1){
            Shop shop = new Shop();
            shop.pridatVeci();
            System.out.println(shop.prodej());
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

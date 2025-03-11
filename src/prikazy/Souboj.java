package prikazy;
import dalsi.Monstrum;
public class Souboj extends Command {
    @Override
    public String execute() {

        int currentLocation = 0;
        switch (currentLocation){
            case 1:
                Monstrum monstrum = new Monstrum("Pavouk",6,50,true); //trhlina
                monstrum.pridaniLoot();

            case 2:
                Monstrum monstrum2 = new Monstrum("Vlkodlak",10,120,true);//les
                monstrum2.pridaniLoot2();
            case 3:
                Monstrum monstrum3 = new Monstrum("Sirena",9,80,true);    //jezero
                monstrum3.pridaniLoot3();
        }

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

import prikazy.Batoh;
import prikazy.Predmet;
import world.Konzole;
import world.WorldMap;

public class Main {
    public static void main(String[] args) {
        Konzole k = new Konzole();
        Batoh batoh = new Batoh();
        batoh.getBatoh().add(new Predmet("kokot",5));
        k.start();





    }
}
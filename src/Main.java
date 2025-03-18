import prikazy.Batoh;
import prikazy.Predmet;
import world.Konzole;
import world.WorldMap;

public class Main {
    public static void main(String[] args) {
        WorldMap wm = new WorldMap();
        wm.nacistMapu();
        Konzole k = new Konzole();
        Batoh b = new Batoh();
        b.getBatoh().add(new Predmet("pavoucioko",1));
        b.getBatoh().add(new Predmet("pavoucisrdce",2));
        b.getBatoh().add(new Predmet("vlkodlacitesak",2));
        b.getBatoh().add(new Predmet("vlkodlacikrev",2));
        b.getBatoh().add(new Predmet("sirenislzy",2));
        b.getBatoh().add(new Predmet("sirenimelodie",3));
        k.start();





    }
}
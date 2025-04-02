package prikazy;

import world.Command;
import world.Location;
import world.WorldMap;

import java.util.Scanner;

/**
 * Třída na pohyb
 */
public class Pohyb extends Command {

    private WorldMap map = new WorldMap();
    private Location location = new Location();
    private Scanner sc = new Scanner(System.in);
    /**
     * metoda na spusteni metody na pohyb
     *
     */
    @Override
    public String execute() {

        System.out.println("Nacházíš se na lokaci\uD83D\uDCCD\uD83D\uDDFA\uFE0F: " + map.getCurrentPosition1().getName().toUpperCase());
        System.out.println("Zvolte směr, kterým chcete jít\uD83E\uDDED: \ns - sever⬆\uFE0F \nj- jih⬇\uFE0F \nz - zapad⬅\uFE0F \nv - vychod➡\uFE0F");
        String direction = "";
        direction = sc.next();
        direction = direction.toLowerCase();
        while (!direction.equals("s") && !direction.equals("j") && !direction.equals("z") && !direction.equals("v")) {
            System.out.println("Špatný směr\uD83E\uDDED");
            direction = sc.next();
            direction.toLowerCase();
        }
        System.out.println(map.move(direction));
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

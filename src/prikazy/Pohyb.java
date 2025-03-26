package prikazy;

import world.Location;
import world.WorldMap;

import java.util.Scanner;

public class Pohyb extends Command {

    private WorldMap map = new WorldMap();
    private Location location = new Location();
    private Scanner sc = new Scanner(System.in);
    /**
     * metoda na spusteni metody na pohyb
     */
    @Override
    public String execute() {

        System.out.println("Nacházíš se na lokaci: " + map.getCurrentPosition1().getName());
        System.out.println("Zvolte směr, kterým chcete jít: s - sever, j- jih, z - zapad, v - vychod");
        String direction = "";
        direction = sc.next();
        direction = direction.toLowerCase();
        while (!direction.equals("s") && !direction.equals("j") && !direction.equals("z") && !direction.equals("v")) {
            System.out.println("Špatný směr");
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

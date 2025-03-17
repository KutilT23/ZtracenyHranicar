package prikazy;

import world.Location;
import world.WorldMap;

import java.util.Scanner;

public class Pohyb extends Command {

    private WorldMap map = new WorldMap();
    private Location location = new Location();
    Scanner sc = new Scanner(System.in);
    @Override
    public String execute() {
       // System.out.println(map.getWorld());
        System.out.println("Nacházíš se na lokaci: " + map.getCurrentPosition1().getName());
        System.out.println("Zvolte směr, kterým chcete jít: sever, jih, zapad, vychod");
        String direction = "";
        direction = sc.next();
        direction = direction.toLowerCase();
        System.out.println(map.move(direction));
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

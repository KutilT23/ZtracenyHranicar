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
        map.nacistMapu();
        map.getWorld();
        System.out.println("Zvolte směr, kterým chcete jít");
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

package world;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;



public class WorldMap {
    static private HashMap<Integer, Location> world = new HashMap<>();
    private static int start = 0;
    private static int currentPosition = start;
    public static boolean maMapu = false;

    public boolean nacistMapu() {
        try (BufferedReader br = new BufferedReader(new FileReader("mapa.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lines = line.split(";");
                Location location = new Location(
                        lines[1],
                        Integer.parseInt(lines[0]),
                        Arrays.copyOfRange(lines, 2, 6)
                );
                world.put(Integer.valueOf(lines[0]), location);
            }

            return true;
        } catch (IOException e) {
            return false;
        }

    }

    public Location getCurrentPosition1(){
        return world.get(currentPosition);
    }

    static public int getCurrentPosition() {
        return currentPosition;
    }

    public HashMap<Integer, Location> getWorld() {
        return world;
    }

    public String move(String smer) {
        int dirIndex;
        switch (smer.toLowerCase()) {
            case "sever":
                dirIndex = 0;
                break;
            case "jih":
                dirIndex = 1;
                break;
            case "vychod":
                dirIndex = 2;
                break;
            case "zapad":
                dirIndex = 3;
                break;
            default:
                return "Neplatný směr! Použijte Sever, Jih, Východ nebo Západ.";
        }

        int newPosition = world.get(currentPosition).getLocations()[dirIndex];
        if (newPosition == -1) {
            return "Tímto směrem nelze jít.";
        } else {
            if(currentPosition == 0&&maMapu==false) {
                return "Tímto směrem nelze jít bez mapy";
            }
            currentPosition = newPosition;
            return "Přesunuli jste se na " + world.get(currentPosition).getName();
        }
    }
}
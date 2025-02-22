import java.util.Arrays;

public class Location {

    private String name;
    private int ID;
    private int[] locations;

    public Location(){

    }

    public Location(String name, int ID, String[] locations) {
        this.name = name;
        this.ID = ID;
        this.locations = new int[4];
        for (int i = 0; i < locations.length; i++) {
            this.locations[i] = Integer.parseInt(locations[i]);
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", locations=" + Arrays.toString(locations) +
                '}';
    }
}

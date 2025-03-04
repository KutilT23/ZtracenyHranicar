public class Main {
    public static void main(String[] args) {
        WorldMap m = new WorldMap();
        m.loadMap();
        System.out.println(m.getWorld());
        System.out.println(m.getCurrentPosition());


    }
}
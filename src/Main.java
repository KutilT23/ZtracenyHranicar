public class Main {
    public static void main(String[] args) {
        WorldMap m = new WorldMap();
        m.loadMap();
        System.out.println(m.getWorld());
        System.out.println(m.getCurrentPosition());
        System.out.println(m.move("Sever"));
        System.out.println(m.move("Jih"));
        System.out.println(m.move("Jih"));
        System.out.println(m.getCurrentPosition());
        System.out.println(m.move("sever"));
        System.out.println(m.move("vychod"));
        System.out.println(m.move("vychod"));
        System.out.println(m.move("vychod"));
        System.out.println(m.move("vychod"));
        System.out.println(m.move("zapad"));
        System.out.println(m.move("jih"));

    }
}
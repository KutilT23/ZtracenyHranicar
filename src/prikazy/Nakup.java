package prikazy;

public class Nakup extends Command{
    @Override
    public String execute() {
        Shop shop = new Shop();
        shop.pridatVeci();
        shop.nakup();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

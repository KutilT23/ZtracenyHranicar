package prikazy;

public class Prodat extends Command{
    @Override
    public String execute() {
        Shop shop = new Shop();
        shop.pridatVeci();
        System.out.println(shop.prodej());
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

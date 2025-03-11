package prikazy;
public class PouzitPredmet extends Command {
    @Override
    public String execute() {
            Batoh b = new Batoh();
            b.pridani();
        System.out.println(b.getBatoh());
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

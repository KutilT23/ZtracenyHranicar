package prikazy;
public class Konec extends Command {
    @Override
    public String execute() {
        return "";
    }

    @Override
    public boolean exit() {
        return true;
    }
}

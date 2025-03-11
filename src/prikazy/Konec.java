package prikazy;
public class Konec extends Command {
    @Override
    public String execute() {
        return "Hra končí...";
    }

    @Override
    public boolean exit() {
        return true;
    }
}

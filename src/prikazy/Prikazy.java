package prikazy;



public class Prikazy extends Command {
    @Override
    public String execute() {
        return "batoh, interakce, konec, pohyb, prikazy, souboj, prodat, nakup";

    }

    @Override
    public boolean exit() {
        return false;
    }
}

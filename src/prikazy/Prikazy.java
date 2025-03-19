package prikazy;



public class Prikazy extends Command {
    @Override
    public String execute() {
        return "batoh, interakce, konec, pohyb, prikazy, souboj, prodat, nakup, textPopis";

    }

    @Override
    public boolean exit() {
        return false;
    }
}

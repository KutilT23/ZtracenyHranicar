package prikazy;



public class Prikazy extends Command {
    @Override
    public String execute() {
      return "batoh, interakce, konec, pohyb, prikazy, pouzit, souboj, prodat, nakup";

    }

    @Override
    public boolean exit() {
        return false;
    }
}

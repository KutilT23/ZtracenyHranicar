package prikazy;



public class Prikazy extends Command {
    @Override
    public String execute() {
      return "batoh, interakce, konec, pohyb, prikazy, pouzitPredmet, souboj, ukol";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

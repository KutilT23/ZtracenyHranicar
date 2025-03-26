package prikazy;



public class Prikazy extends Command {
    /**
     * metoda na vypsani vsech prikazu
     */
    @Override
    public String execute() {
        return "batoh, interakce, konec, pohyb, prikazy, souboj, prodat, nakup, pribeh";

    }
    /**
     * metoda na zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return false;
    }
}

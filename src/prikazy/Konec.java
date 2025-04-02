package prikazy;

import world.Command;

/**
 * Třída pro ukončení hry
 */
public class Konec extends Command {
    /**
     * metoda pro vypsani konce hry
     */
    @Override
    public String execute() {
        return "Hra končí\uD83C\uDFC1...";
    }
    /**
     * metoda na zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return true;
    }
}

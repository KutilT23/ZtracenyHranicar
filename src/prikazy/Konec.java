package prikazy;

import world.Command;

public class Konec extends Command {
    /**
     * metoda pro vypsani konce hry
     */
    @Override
    public String execute() {
        return "Hra končí...";
    }
    /**
     * metoda na zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return true;
    }
}

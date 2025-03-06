package prikazy;

import java.util.ArrayList;
import Predmet.Predmet;
import Predmet.TypPredmetu;

public class Batoh extends Command {

    private ArrayList<Predmet>batoh = new ArrayList<>();
    Predmet mec = new Predmet("Mec",10, TypPredmetu.MEC,2);

    public ArrayList<Predmet> getBatoh() {
        return batoh;
    }

    @Override
    public String execute() {
        batoh.add(mec);
        batoh.add(mec);
        System.out.println(getBatoh());
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String toString() {
        return "Batoh{" +
                "batoh=" + batoh +
                ", mec=" + mec +
                '}';
    }
}

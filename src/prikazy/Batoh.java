package prikazy;

import java.util.ArrayList;

public class Batoh extends Command {

    public ArrayList<Predmet>batoh = new ArrayList<>();
    Predmet mec = new Predmet("Mec",10,2,TypPredmetu.MEC);
    Predmet heal = new Predmet("Heal",1,TypPredmetu.LEKTVARHEAL,10);


    public ArrayList<Predmet> getBatoh() {
        return batoh;
    }
    private String vypis = "";
    public void pridani(){
        batoh.add(mec);
        batoh.add(heal);
    }
    @Override
    public String execute() {

        pridani();
        for (int i = 0; i < batoh.size(); i++) {
            if(batoh.get(i).getHeal()==0){
                vypis += batoh.get(i).toString1();
            }else{
                vypis += batoh.get(i).toString();
            }

        }
        System.out.println(getBatoh());
        return vypis;
    }

    public String getVypis() {
        return vypis;
    }

    public void setVypis(String vypis) {
        this.vypis = vypis;
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

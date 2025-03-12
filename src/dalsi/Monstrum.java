package dalsi;


import prikazy.Predmet;

import java.util.ArrayList;

public class Monstrum {

    private String jmeno;
    private int sila;
    private int zivoty;


    public Monstrum(String jmeno, int sila, int zivoty) {
        this.jmeno = jmeno;
        this.sila = sila;
        this.zivoty = zivoty;

    }

    ArrayList<Predmet>monstra1 = new ArrayList<>();
    ArrayList<Predmet>monstra2 = new ArrayList<>();
    ArrayList<Predmet>monstra3 = new ArrayList<>();

    public void pridaniLoot(){
        //trhlina
        monstra1.add(new Predmet("PavouciNoha",3));
        monstra1.add(new Predmet("PavouciSrdce",2));
        monstra1.add(new Predmet("PavouciOko",1));
        monstra1.add(new Predmet("PavouciJed",1));

    }
    public void pridaniLoot2(){
        //les
        monstra2.add(new Predmet("VlkodlaciDrap",1));
        monstra2.add(new Predmet("VlkodlaciTesak",1));
        monstra2.add(new Predmet("VlkodlaciKrev",1));
        monstra2.add(new Predmet("VlkodlaciHlava",3));//možna trofey room??? :DDD
    }
    public void pridaniLoot3(){
        //jezero
        monstra3.add(new Predmet("SireniSupiny",1));
        monstra3.add(new Predmet("SireniSlzy",1));
        monstra3.add(new Predmet("SireniMelodie",1));
        monstra3.add(new Predmet("SireniSrdce",2));



    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getZivoty() {
        return zivoty;
    }

    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }

    public ArrayList<Predmet> getMonstra1() {
        return monstra1;
    }

    public ArrayList<Predmet> getMonstra2() {
        return monstra2;
    }

    public ArrayList<Predmet> getMonstra3() {
        return monstra3;
    }

    @Override
    public String toString() {
        return "Monstrum{" +
                "jmeno='" + jmeno + '\'' +
                ", sila=" + sila +
                ", zivoty=" + zivoty +
                '}';
    }
}

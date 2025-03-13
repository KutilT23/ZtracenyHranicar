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
        monstra1.add(new Predmet("pavoucinoha",1));
        monstra1.add(new Predmet("pavoucisrdce",2));
        monstra1.add(new Predmet("pavoucioko",1));
        monstra1.add(new Predmet("pavoucijed",2));

    }
    public void pridaniLoot2(){
        //les
        monstra2.add(new Predmet("vlkodlacidrap",1));
        monstra2.add(new Predmet("vlkodlacitesak",1));
        monstra2.add(new Predmet("vlkodlacikrev",2));
        monstra2.add(new Predmet("vlkodlacihlava",3));//možna trofey room??? :DDD
    }
    public void pridaniLoot3(){
        //jezero
        monstra3.add(new Predmet("sirenisupiny",1));
        monstra3.add(new Predmet("sirenislzy",2));
        monstra3.add(new Predmet("sirenimelodie",3));
        monstra3.add(new Predmet("sirenisrdce",2));

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

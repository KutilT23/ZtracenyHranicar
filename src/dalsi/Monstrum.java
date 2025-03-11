package dalsi;


import java.util.ArrayList;

public class Monstrum {

    private String jmeno;
    private int sila;
    private int zivoty;
    private boolean jeNazivu = true;

    public Monstrum(String jmeno, int sila, int zivoty, boolean jeNazivu) {
        this.jmeno = jmeno;
        this.sila = sila;
        this.zivoty = zivoty;
        this.jeNazivu = jeNazivu;
    }

    ArrayList<Lootdrop>monstra1 = new ArrayList<>();
    ArrayList<Lootdrop>monstra2 = new ArrayList<>();
    ArrayList<Lootdrop>monstra3 = new ArrayList<>();

    public void pridaniLoot(){
        //trhlina
        monstra1.add(new Lootdrop("PavouciNoha",3));
        monstra1.add(new Lootdrop("PavouciSrdce",2));
        monstra1.add(new Lootdrop("PavouciOko",1));
        monstra1.add(new Lootdrop("PavouciJed",1));

    }
    public void pridaniLoot2(){
        //les
        monstra2.add(new Lootdrop("VlkodlaciDrap",1));
        monstra2.add(new Lootdrop("VlkodlaciTesak",1));
        monstra2.add(new Lootdrop("VlkodlaciKrev",1));
        monstra2.add(new Lootdrop("VlkodlaciHlava",3));//možna trofey room??? :DDD
    }
    public void pridaniLoot3(){
        //jezero
        monstra3.add(new Lootdrop("SireniSupiny",1));
        monstra3.add(new Lootdrop("SireniSlzy",1));
        monstra3.add(new Lootdrop("SireniMelodie",1));
        monstra3.add(new Lootdrop("SireniSrdce",2));



    }


}

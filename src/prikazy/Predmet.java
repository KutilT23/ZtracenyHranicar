package prikazy;

public class Predmet {
    private String nazev;
    private int sila;
    private TypPredmetu typPredmetu;
    private int heal;
    private int cena;
    private int hodnota;


    public Predmet() {
    }

    public Predmet(String nazev, int sila, TypPredmetu typPredmetu) {
        this.nazev = nazev;
        this.sila = sila;
        this.typPredmetu = typPredmetu;
    }
    public Predmet(String nazev, int sila, TypPredmetu typPredmetu,int cena) {
        this.nazev = nazev;
        this.sila = sila;
        this.typPredmetu = typPredmetu;
        this.cena = cena;
        this.hodnota = cena;
    }

    public Predmet(String nazev, TypPredmetu typPredmetu, int heal) {
        this.nazev = nazev;
        this.typPredmetu = typPredmetu;
        this.heal = heal;

    }
    public Predmet(String nazev, TypPredmetu typPredmetu, int heal,int cena) {
        this.nazev = nazev;
        this.typPredmetu = typPredmetu;
        this.heal = heal;
        this.cena = cena;
        this.hodnota = cena;

    }

    public Predmet(String nazev,int hodnota) {
        this.nazev = nazev;
        this.hodnota = hodnota;

    }

    @Override
    public String toString() {
        return "\nNazev:  " + nazev + ", \nSila: " + sila + ", Hodnota: " + hodnota + ", Heal: " + heal+ ", Typ: " + typPredmetu;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }


    public TypPredmetu getTypPredmetu() {
        return typPredmetu;
    }

    public void setTypPredmetu(TypPredmetu typPredmetu) {
        this.typPredmetu = typPredmetu;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }
}

package prikazy;

public class Predmet {
    private String nazev;
    private int sila;
    private int objem;
    private TypPredmetu typPredmetu;
    private int heal;

    public Predmet() {
    }

    public Predmet(String nazev, int sila, int objem, TypPredmetu typPredmetu) {
        this.nazev = nazev;
        this.sila = sila;
        this.objem = objem;
        this.typPredmetu = typPredmetu;
    }

    public Predmet(String nazev, int objem, TypPredmetu typPredmetu, int heal) {
        this.nazev = nazev;
        this.objem = objem;
        this.typPredmetu = typPredmetu;
        this.heal = heal;
    }

    public String toString1() {
        return "Predmet{" +
                "nazev='" + nazev + '\'' +
                ", sila=" + sila +
                ", objem=" + objem +
                ", typPredmetu=" + typPredmetu +
                '}';
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "nazev='" + nazev + '\'' +
                ", objem=" + objem +
                ", typPredmetu=" + typPredmetu +
                ", heal=" + heal +
                '}';
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

    public int getObjem() {
        return objem;
    }

    public void setObjem(int objem) {
        this.objem = objem;
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
}

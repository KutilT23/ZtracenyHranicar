package dalsi;

public class Lootdrop {
    private String nazev;
    private int objem;

    public Lootdrop(String nazev, int objem) {
        this.nazev = nazev;
        this.objem = objem;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getObjem() {
        return objem;
    }

    public void setObjem(int objem) {
        this.objem = objem;
    }

    @Override
    public String toString() {
        return "dalsi.Lootdrop{" +
                "nazev='" + nazev + '\'' +
                ", objem=" + objem +
                '}';
    }
}

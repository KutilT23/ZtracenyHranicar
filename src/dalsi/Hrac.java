package dalsi;

/**
 * Třída pro nastavení parametrů hráče
 */
public class Hrac {
    private static int zivoty = 100;
    private static int sila = 5;
    private static int penize = 0;

    public static int getPenize() {
        return penize;
    }

    public static void setPenize(int penize) {
        Hrac.penize = penize;
    }

    public static int getZivoty() {
        return zivoty;
    }

    public static void setZivoty(int zivoty) {
        Hrac.zivoty = zivoty;
    }

    public static int getSila() {
        return sila;
    }

    public static void setSila(int sila) {
        Hrac.sila = sila;
    }
}

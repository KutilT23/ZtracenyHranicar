package prikazy;
import dalsi.Hrac;
import dalsi.Monstrum;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import world.Konzole;
import world.Location;
import world.WorldMap;

public class Souboj extends Command {
    ArrayList<Predmet>vyhra = new ArrayList<>();
    private boolean jeMrtvy = false;

    public ArrayList<Predmet> getVyhra() {
        return vyhra;
    }
    Random rd = new Random();
    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);
        Batoh b = new Batoh();
        System.out.println("Zvolte si 1-3");

        WorldMap wm = new WorldMap();

        int aktualniPozice = wm.getCurrentPosition();
        System.out.println("Aktuální pozice: " + aktualniPozice);


        if (aktualniPozice == 5 || aktualniPozice == 6 || aktualniPozice == 7 || aktualniPozice == 2) {
            System.out.println("Jsi na lokaci s monstry: " + aktualniPozice);

            switch (aktualniPozice) {
                case 5:
                    Monstrum monstrum = new Monstrum("Pavouk", 3, 50); //trhlina
                    monstrum.pridaniLoot();
                    System.out.println("Jsi v souboji s  " + monstrum);
                    while (Hrac.getZivoty() > 0 && monstrum.getZivoty() > 0) {
                        System.out.println(monstrum.getJmeno() + ", Hp: " + monstrum.getZivoty() + ", Síla: " + monstrum.getSila());
                        System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                        monstrum.setZivoty(monstrum.getZivoty() - Hrac.getSila());
                        if (monstrum.getZivoty() <= 0) {
                            System.out.println("Vyhrál jsi");
                            b.getBatoh().add(monstrum.getMonstra1().get(rd.nextInt(4)));
                            System.out.println(b.getBatoh());
                        }
                        Hrac.setZivoty(Hrac.getZivoty() - monstrum.getSila());
                        if (Hrac.getZivoty() <= 0) {
                            System.out.println("Zemřel jsi");
                            jeMrtvy = true;
                        }
                    }
                    break;
                case 6:
                    Monstrum monstrum2 = new Monstrum("Vlkodlak", 8, 100); //les
                    monstrum2.pridaniLoot2();
                    System.out.println("Jsi v souboji s  " + monstrum2);
                    while (Hrac.getZivoty() > 0 && monstrum2.getZivoty() > 0) {
                        System.out.println(monstrum2.getJmeno() + ", Hp: " + monstrum2.getZivoty() + ", Síla: " + monstrum2.getSila());
                        System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                        monstrum2.setZivoty(monstrum2.getZivoty() - Hrac.getSila());
                        if (monstrum2.getZivoty() <= 0) {
                            System.out.println("Vyhrál jsi");
                            b.getBatoh().add(monstrum2.getMonstra2().get(rd.nextInt(4)));
                            System.out.println(b.getBatoh());
                        }
                        Hrac.setZivoty(Hrac.getZivoty() - monstrum2.getSila());
                        if (Hrac.getZivoty() <= 0) {
                            System.out.println("Zemřel jsi");
                            jeMrtvy = true;
                        }
                    }
                    break;
                case 7:
                    Monstrum monstrum3 = new Monstrum("Sirena", 10, 80); //jezero
                    monstrum3.pridaniLoot3();
                    System.out.println("Jsi v souboji s  " + monstrum3);
                    while (Hrac.getZivoty() > 0 && monstrum3.getZivoty() > 0) {
                        System.out.println(monstrum3.getJmeno() + ", Hp: " + monstrum3.getZivoty() + ", Síla: " + monstrum3.getSila());
                        System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                        monstrum3.setZivoty(monstrum3.getZivoty() - Hrac.getSila());
                        if (monstrum3.getZivoty() <= 0) {
                            System.out.println("Vyhrál jsi");
                            b.getBatoh().add(monstrum3.getMonstra3().get(rd.nextInt(4)));
                            System.out.println(b.getBatoh());
                        }
                        Hrac.setZivoty(Hrac.getZivoty() - monstrum3.getSila());
                        if (Hrac.getZivoty() <= 0) {
                            System.out.println("Zemřel jsi");
                            jeMrtvy = true;
                        }
                    }
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Není volba");
            }
        } else {
            System.out.println("Tato pozice nemá monstra.");
        }

        return "";
    }


    @Override
    public boolean exit() {
        return jeMrtvy;
    }

}

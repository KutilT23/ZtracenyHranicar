package prikazy;
import dalsi.Hrac;
import dalsi.Monstrum;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import world.Command;
import dalsi.Predmet;
import world.WorldMap;

public class Souboj extends Command {
    ArrayList<Predmet>vyhra = new ArrayList<>();
    private boolean jeMrtvy = false;
    private boolean drakMrtev = false;


    public ArrayList<Predmet> getVyhra() {
        return vyhra;
    }
    /**
     * metoda na souboj s monstry a final bossem
     */
    Random rd = new Random();
    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);
        Batoh b = new Batoh();


        WorldMap wm = new WorldMap();

        int aktualniPozice = wm.getCurrentPosition();


        if (aktualniPozice == 5 || aktualniPozice == 6 || aktualniPozice == 7 || aktualniPozice == 2) {
            System.out.println("Jsi na lokaci s monstry: " + wm.getCurrentPosition1().getName());

            switch (aktualniPozice) {
                case 5:
                    Monstrum monstrum = new Monstrum("Pavouk", 3, 50); //trhlina
                    monstrum.pridaniLoot();
                    System.out.println("Jsi v souboji s  " + monstrum + "\uD83D\uDD77\uFE0F");
                    while (Hrac.getZivoty() > 0 && monstrum.getZivoty() > 0) {
                        System.out.println(monstrum.getJmeno() + ", Hp: " + monstrum.getZivoty() + ", Síla: " + monstrum.getSila());
                        System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                        monstrum.setZivoty(monstrum.getZivoty() - Hrac.getSila());
                        Hrac.setZivoty(Hrac.getZivoty() - monstrum.getSila());
                        if (monstrum.getZivoty() <= 0&& Hrac.getZivoty() > 0) {
                            System.out.println("Vyhrál jsi \n" +"Tvoje životy: " + Hrac.getZivoty());
                            b.getBatoh().add(monstrum.getMonstra1().get(rd.nextInt(4)));
                            System.out.println("Tvoje odměna:"+  b.getBatoh().getLast());
                        }
                        if (Hrac.getZivoty() <= 0) {
                            Hrac.setZivoty(0);
                            System.out.println("Zemřel jsi\n" +"Tvoje životy: " + Hrac.getZivoty());
                            jeMrtvy = true;
                        }
                    }
                    break;
                case 6:
                    Monstrum monstrum2 = new Monstrum("Vlkodlak", 6, 100); //les
                    monstrum2.pridaniLoot2();
                    System.out.println("Jsi v souboji s  " + monstrum2 + "\uD83D\uDC3A\uD83C\uDF15");
                    while (Hrac.getZivoty() > 0 && monstrum2.getZivoty() > 0) {
                        System.out.println(monstrum2.getJmeno() + ", Hp: " + monstrum2.getZivoty() + ", Síla: " + monstrum2.getSila());
                        System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                        monstrum2.setZivoty(monstrum2.getZivoty() - Hrac.getSila());
                        Hrac.setZivoty(Hrac.getZivoty() - monstrum2.getSila());
                        if (monstrum2.getZivoty() <= 0&& Hrac.getZivoty() > 0) {
                            System.out.println("Vyhrál jsi \n" +"Tvoje životy: " + Hrac.getZivoty());
                            b.getBatoh().add(monstrum2.getMonstra2().get(rd.nextInt(4)));
                            System.out.println("Tvoje odměna:"+  b.getBatoh().getLast());
                        }
                        if (Hrac.getZivoty() <= 0) {
                            Hrac.setZivoty(0);
                            System.out.println("Zemřel jsi\n" +"Tvoje životy: " + Hrac.getZivoty());
                            jeMrtvy = true;
                        }
                    }
                    break;
                case 7:
                    Monstrum monstrum3 = new Monstrum("Sirena", 10, 80); //jezero    bonusovy souboj
                    monstrum3.pridaniLoot3();
                    System.out.println("Jsi v souboji s  " + monstrum3 + "\uD83E\uDDDC\uD83C\uDFFB\u200D♀\uFE0F");
                    while (Hrac.getZivoty() > 0 && monstrum3.getZivoty() > 0) {
                        System.out.println(monstrum3.getJmeno() + ", Hp: " + monstrum3.getZivoty() + ", Síla: " + monstrum3.getSila());
                        System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                        monstrum3.setZivoty(monstrum3.getZivoty() - Hrac.getSila());
                        Hrac.setZivoty(Hrac.getZivoty() - monstrum3.getSila());
                        if (monstrum3.getZivoty() <= 0&& Hrac.getZivoty() > 0) {
                            System.out.println("Vyhrál jsi \n" +"Tvoje životy: " + Hrac.getZivoty());
                            b.getBatoh().add(monstrum3.getMonstra3().get(rd.nextInt(4)));
                            System.out.println("Tvoje odměna:"+  b.getBatoh().getLast());
                        }
                        if (Hrac.getZivoty() <= 0) {
                            Hrac.setZivoty(0);
                            System.out.println("Zemřel jsi\n" +"Tvoje životy: " + Hrac.getZivoty());
                            jeMrtvy = true;
                        }
                    }
                    break;
                case 2:
                    if(!drakMrtev){
                        Monstrum monstrum4 = new Monstrum("Drak", 10, 150);
                        System.out.println("Jsi v souboji s  " + monstrum4 + "\uD83D\uDD25\uD83D\uDC32");
                        while (Hrac.getZivoty() > 0 && monstrum4.getZivoty() > 0) {
                            if(Hrac.getZivoty() >0&& Hrac.getZivoty()<=20) {
                                System.out.println("Chcete se vyhealovat?  (ano, ne)");
                                String odpoved = sc.next();
                                odpoved = odpoved.toLowerCase();
                                while (!odpoved.equals("ano")&&!odpoved.equals("ne")) {
                                    System.out.println("Špatná odpověď");
                                    odpoved = sc.next();
                                    odpoved = odpoved.toLowerCase();
                                }
                                switch (odpoved){
                                    case "ano":
                                        for (int i = 0; i <b.getBatoh().size() ; i++) {
                                            if(b.getBatoh().get(i).getNazev().equals("heal")||b.getBatoh().get(i).getNazev().equals("healm")) {
                                                Hrac.setZivoty(Hrac.getZivoty() + b.getBatoh().get(i).getHeal());
                                                b.getBatoh().remove(i);
                                                break;
                                            }
                                        }
                                        break;
                                    case "ne":
                                        System.out.println("Nuže dobrá, tak heal nebude");
                                        break;
                                    default:
                                        System.out.println("Špatná odpověď");
                                }

                            }
                            System.out.println(monstrum4.getJmeno() + ", Hp: " + monstrum4.getZivoty() + ", Síla: " + monstrum4.getSila());
                            System.out.println("Hráč, Hp: " + Hrac.getZivoty() + ", Síla: " + Hrac.getSila());
                            monstrum4.setZivoty(monstrum4.getZivoty() - Hrac.getSila());
                            Hrac.setZivoty(Hrac.getZivoty() - monstrum4.getSila());
                            if (monstrum4.getZivoty() <= 0 && Hrac.getZivoty() > 0) {
                                System.out.println("Vyhrál jsi");
                                System.out.println("Porazil draka a vyhrál hru");
                                drakMrtev = true;
                            }
                            if (Hrac.getZivoty() <= 0) {
                                System.out.println("Zemřel jsi na úplném konci\n" +"Tvoje životy: " + Hrac.getZivoty());
                                jeMrtvy = true;
                            }
                        }

                    }else{
                        System.out.println("Drak už byl poražen");
                    }


                    break;
                default:
                    System.out.println("Není volba");
            }
        } else {
            System.out.println("Tato pozice nemá monstra.");
        }

        return "";
    }

    /**
     * metoda na zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return jeMrtvy;
    }

}

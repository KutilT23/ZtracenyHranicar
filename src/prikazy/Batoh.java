package prikazy;

import dalsi.Hrac;
import dalsi.TypPredmetu;
import world.Command;
import dalsi.Predmet;

import java.util.ArrayList;
import java.util.Scanner;

public class Batoh extends Command {

    private static ArrayList<Predmet>batoh = new ArrayList<>();
    private static ArrayList<Predmet> ruka = new ArrayList();



    public ArrayList<Predmet> getBatoh() {
        return batoh;
    }
    private String vypis = "";
    /**
     * metoda na použití předmětu v batohu - přidá předmět do listu ruka
     */
    public void pouziti(){
        if(batoh.isEmpty()){
            System.out.println("Není co použít");
        }else{


        boolean predmetNalezen = false;
        System.out.println();
        System.out.println(getBatoh());
        System.out.println("Který předmět chcete použít? ");
        Scanner sc = new Scanner(System.in);
        String odpoved = sc.next();
        for (int i = 0; i < getBatoh().size(); i++) {
            String nazevPredmetu2 = batoh.get(i).getNazev();
            TypPredmetu typPredmetu2 = batoh.get(i).getTypPredmetu();

            if(nazevPredmetu2.equals(odpoved) && typPredmetu2 != null){
                Hrac.setSila(5);
                ruka.clear();
                ruka.add(getBatoh().get(i));
                Hrac.setSila(Hrac.getSila()+ruka.get(0).getSila());
                System.out.println("Hráčova síla: " + Hrac.getSila());

                if(ruka.get(0).getTypPredmetu().equals(TypPredmetu.LEKTVARHEAL)&&Hrac.getZivoty()<100){

                    Hrac.setZivoty(Hrac.getZivoty()+ruka.get(0).getHeal());
                    getBatoh().remove(i);
                    ruka.clear();
                    if(Hrac.getZivoty()>100){
                        Hrac.setZivoty(100);
                    }

                    System.out.println(Hrac.getZivoty());

                    System.out.println("Batoh:" + getBatoh());
                    predmetNalezen = true;
                    break;
                }
                predmetNalezen = true;
                if(ruka.get(0).getTypPredmetu().equals(TypPredmetu.LEKTVARHEAL)&&Hrac.getZivoty()==100){
                    System.out.println("Již máš plné životy");
                    System.out.println(Hrac.getZivoty());
                    ruka.clear();

                }

                System.out.println("Batoh" + getBatoh());
                System.out.println("Předmět používaný: " + getRuka());

            }

        }
        if(!predmetNalezen){
            System.out.println("Předmět nenalezen/nelze použít");
        }
        }
    }
    /**
     * metoda na spusteni metod v batohu
     */
    @Override
    public String execute() {
        System.out.println("Co chcete udělat: \n1: Prohlédnout si batoh\uD83C\uDF92:\n2: Použít předmět z batohu\uD83E\uDE93❤\uFE0F");
        Scanner sc = new Scanner(System.in);
        String odpoved = sc.next();

        switch (odpoved){
            case "1":
                System.out.println("Batoh\uD83C\uDF92: " + getBatoh());
                System.out.println("Ruka✋: " + getRuka());
                break;
            case "2":
                pouziti();
                break;
            default:
                System.out.println("Není volba");
                break;
        }

        return "";
    }

    public String getVypis() {
        return vypis;
    }

    public void setVypis(String vypis) {
        this.vypis = vypis;
    }

    public ArrayList<Predmet> getRuka() {
        return ruka;
    }
    /**
     * metoda na zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return false;
    }

}

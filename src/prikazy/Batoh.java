package prikazy;

import dalsi.Hrac;

import java.util.ArrayList;
import java.util.Scanner;

public class Batoh extends Command {

    private static ArrayList<Predmet>batoh = new ArrayList<>();
    private static ArrayList<Predmet> ruka = new ArrayList();



    public ArrayList<Predmet> getBatoh() {
        return batoh;
    }
    private String vypis = "";

    public void pouziti(){

        System.out.println();
        System.out.println(getBatoh());
        System.out.println("Který předmět chcete použít? ");
        Scanner sc = new Scanner(System.in);
        String odpoved = sc.next();
        for (int i = 0; i < getBatoh().size(); i++) {
            if(odpoved.equals(getBatoh().get(i).getNazev())){
                ruka.clear();
                ruka.add(getBatoh().get(i));
                Hrac.setSila(Hrac.getSila()+ruka.get(0).getSila());

                if(ruka.get(0).getTypPredmetu().equals(TypPredmetu.LEKTVARHEAL)&&Hrac.getZivoty()<100){

                    Hrac.setZivoty(Hrac.getZivoty()+ruka.get(0).getHeal());
                    getBatoh().remove(i);
                    ruka.clear();

                    if(Hrac.getZivoty()>100){
                        Hrac.setZivoty(100);
                    }

                    System.out.println(Hrac.getZivoty());

                    System.out.println("Batoh:" + getBatoh());
                    break;
                }

                System.out.println("Batoh" + getBatoh());
                System.out.println("Předmět pouzivany: " + getRuka());

            }

        }
    }
    @Override
    public String execute() {
        System.out.println("Pro prohlednuti stisknete 1 pro pouziti 2");
        Scanner sc = new Scanner(System.in);
        int odpoved = sc.nextInt();

            switch (odpoved){
                case 1:
                    System.out.println(getBatoh());
                    break;
                case 2:
                    pouziti();
                    break;
                    default:
                        System.out.println("Není volba");
                        break;
            }

       /* for (int i = 0; i < batoh.size(); i++) {
            if(batoh.get(i).getHeal()==0){
                vypis += batoh.get(i).toString1();
            }else{
                vypis += batoh.get(i).toString();
            }

        }

        */



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

    @Override
    public boolean exit() {
        return false;
    }

}

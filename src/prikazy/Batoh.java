package prikazy;

import dalsi.Hrac;

import java.util.ArrayList;
import java.util.Scanner;

public class Batoh extends Command {

    public ArrayList<Predmet>batoh = new ArrayList<>();
    private ArrayList<Predmet> ruka = new ArrayList();



    public ArrayList<Predmet> getBatoh() {
        return batoh;
    }
    private String vypis = "";
    public void pridani(Predmet p) {
        batoh.add(p);
    }
    Hrac hrac = new Hrac();
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

                if(ruka.get(0).getTypPredmetu().equals(TypPredmetu.LEKTVARHEAL)&&hrac.getZivoty()<100){

                    hrac.setZivoty(hrac.getZivoty()+ruka.get(0).getHeal());
                    getBatoh().remove(i);
                    ruka.clear();

                    if(hrac.getZivoty()>100){
                        hrac.setZivoty(100);
                    }

                    System.out.println(hrac.getZivoty());
                    i--;
                }

                System.out.println(getRuka());

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
                    Hrac hrac = new Hrac();
                    pouziti();
                    break;
                    default:
                        System.out.println("Není volba");
                        break;
            }

        for (int i = 0; i < batoh.size(); i++) {
            if(batoh.get(i).getHeal()==0){
                vypis += batoh.get(i).toString1();
            }else{
                vypis += batoh.get(i).toString();
            }

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

    @Override
    public boolean exit() {
        return false;
    }

}

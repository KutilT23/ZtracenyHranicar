package prikazy;

import dalsi.Hrac;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static ArrayList<Predmet>shop = new ArrayList<>();

    public static ArrayList<Predmet> getShop() {
        return shop;
    }
    public void pridatVeci(){
        shop.clear();
        shop.add(new Predmet("sekyra",8,TypPredmetu.ZBRAN,4));
        shop.add(new Predmet("mec",10,TypPredmetu.ZBRAN,5));
        shop.add(new Predmet("kladivo",6,TypPredmetu.ZBRAN,3));
        shop.add(new Predmet("lopata",4,TypPredmetu.ZBRAN,2));
        shop.add(new Predmet("dyka",2,TypPredmetu.ZBRAN,1));
        shop.add(new Predmet("heal",TypPredmetu.LEKTVARHEAL,50,2));
        shop.add(new Predmet("healm",TypPredmetu.LEKTVARHEAL,25,1));


    }
    private boolean jeVShopu = false;

    public void nakup(){
        Batoh b = new Batoh();
        if(Hrac.getPenize()==0){
            System.out.println("Nemáš peníze");
        }else{
            System.out.println("Vítej v mém obchodě Hraničáři, co si chceš koupit? " + "\n sekyra: Síla-8, Cena-4 \n mec: Síla-10, Cena-5 \n kladivo: Síla-6, Cena-3 \n lopata: Síla-4, Cena-2\n dyka: Síla-2, Cena-1 \n heal Efekt-50Hp+, Cena-2 \n healm Efekt-25Hp+, Cena-1 ");
            System.out.println("Počet tvých zlaťáků: " + Hrac.getPenize());
            Scanner sc = new Scanner(System.in);
            String odpoved = sc.next();
            odpoved = odpoved.toLowerCase();
            for (int i = 0; i < shop.size(); i++) {
                if(odpoved.equals(shop.get(i).getNazev())){

                    if(Hrac.getPenize()-shop.get(i).getCena()>=0){
                        Hrac.setPenize(Hrac.getPenize()-shop.get(i).getCena());
                        b.getBatoh().add(shop.get(i));
                        System.out.println("Úspěšně nakoupeno "+ shop.get(i).getNazev());
                        System.out.println("Zbývající peníze: " + Hrac.getPenize());
                    }else{
                        System.out.println("Nemáš dostatek zlaťáků");
                    }
                    jeVShopu = true;
                }


            }
            if(!jeVShopu){
                System.out.println("Předmět není v prodeji");
            }

        }


    }
    public String prodej(){
        Batoh b = new Batoh();
        if(b.getBatoh().isEmpty()){
            System.out.println("V batohu nic není");
        }else{

            System.out.println("Vítej v mém krámku Hraničáři, zde můžeš prodat vše co vlastníš");
            System.out.println("Obsah tvého batohu: " + b.getBatoh());
            System.out.println("Počet tvých zlaťáků: " + Hrac.getPenize());
            Scanner sc = new Scanner(System.in);
            String prodani = sc.next();
            prodani = prodani.toLowerCase();
            for (int i = 0; i < b.getBatoh().size(); i++) {
                if(prodani.equals(b.getBatoh().get(i).getNazev())){
                    Hrac.setPenize(Hrac.getPenize()+b.getBatoh().get(i).getHodnota());
                    b.getBatoh().remove(i);
                    System.out.println("Úspěšně prodáno :)");
                    return"Batoh: " + b.getBatoh() + " \nPočet tvých zlaťáků: " + Hrac.getPenize();
                }

            }
        }
        return "Předmět nenalezen";
    }


}




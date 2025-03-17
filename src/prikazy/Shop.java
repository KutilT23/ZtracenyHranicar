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
        shop.add(new Predmet("heal",TypPredmetu.LEKTVARHEAL,50,2));
        shop.add(new Predmet("dyka",2,TypPredmetu.ZBRAN,1));

    }
    public void nakup(){
        Batoh b = new Batoh();
        System.out.println("Vítej v mém obchodě Hraničáři, co si chceš koupit? " + "\n sekyra: Síla-8, Cena-4 \n mec: Síla-10, Cena-5 \n kladivo: Síla-6, Cena-3 \n lopata: Síla-4, Cena-2\n heal Efekt-50Hp+, Cena-2 \n dyka: Síla-2, Cena-1 ");
        System.out.println("Počet tvých zlaťáků: " + Hrac.getPenize());
        Scanner sc = new Scanner(System.in);
        String odpoved = sc.next();
        odpoved = odpoved.toLowerCase();
        switch (odpoved){
            case "sekyra":
                if(Hrac.getPenize()>=shop.get(0).getCena()){
                    b.getBatoh().add(shop.get(0));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(0).getCena());
                    System.out.println("Úspěšně nakoupeno "+ shop.get(0).getNazev());
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());

                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
                break;
            case "mec":
                if(Hrac.getPenize()>=shop.get(1).getCena()){
                    b.getBatoh().add(shop.get(1));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(1).getCena());
                    System.out.println("Úspěšně nakoupeno "+ shop.get(1).getNazev());
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());
                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
                break;
            case "kladivo":
                if(Hrac.getPenize()>=shop.get(2).getCena()){
                    b.getBatoh().add(shop.get(2));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(2).getCena());
                    System.out.println("Úspěšně nakoupeno "+ shop.get(2).getNazev());
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());
                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
                break;
            case "lopata":
                if(Hrac.getPenize()>=shop.get(3).getCena()){
                    b.getBatoh().add(shop.get(3));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(3).getCena());
                    System.out.println("Úspěšně nakoupeno "+ shop.get(3).getNazev());
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());
                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
            case "heal":
                if(Hrac.getPenize()>=shop.get(4).getCena()){
                    b.getBatoh().add(shop.get(4));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(4).getCena());
                    System.out.println("Úspěšně nakoupeno "+ shop.get(4).getNazev());
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());
                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
                break;
            case "dyka":
                if(Hrac.getPenize()>=shop.get(5).getCena()){
                    b.getBatoh().add(shop.get(5));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(5).getCena());
                    System.out.println("Úspěšně nakoupeno "+ shop.get(5).getNazev());
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());
                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
              break;
            default:
                System.out.println("Předmět není v nabídce");
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
            if(prodani.equals(b.getBatoh().get(i).getNazev())||Integer.parseInt(prodani) == i){
                Hrac.setPenize(Hrac.getPenize()+b.getBatoh().get(i).getHodnota());
                b.getBatoh().remove(i);
                System.out.println("Úspěšně prodáno :)");
                return"Batoh: " + b.getBatoh() + " Zlaťáky: " + Hrac.getPenize();
            }

            }
        }
        return "Předmět nenalezen";
    }


}




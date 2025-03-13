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
        shop.add(new Predmet("sekyra",8,TypPredmetu.ZBRAN,4));
        shop.add(new Predmet("mec",10,TypPredmetu.ZBRAN,5));
        shop.add(new Predmet("kladivo",6,TypPredmetu.ZBRAN,3));
        shop.add(new Predmet("lopata",4,TypPredmetu.ZBRAN,2));
        shop.add(new Predmet("heal",TypPredmetu.LEKTVARHEAL,50,2));
        shop.add(new Predmet("dyka",2,TypPredmetu.ZBRAN,1));

    }
    public void nakup(){
        Batoh b = new Batoh();
        System.out.println("Vítej v mém obchodě Hraničáři, co si chceš koupit? " + "\n sekyra, mec, kladivo, lopata, heal,dyka ");
        Scanner sc = new Scanner(System.in);
        String odpoved = sc.next();
        odpoved = odpoved.toLowerCase();
        switch (odpoved){
            case "sekyra":
                if(Hrac.getPenize()>=shop.get(0).getCena()){
                    b.getBatoh().add(shop.get(0));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(0).getCena());
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
                    System.out.println("Obsah batohu: " + b.getBatoh());
                    System.out.println("Zbývající peníze: " + Hrac.getPenize());
                }else{
                    System.out.println("Nemáš dost zlaťáků");
                }
            case "heal":
                if(Hrac.getPenize()>=shop.get(4).getCena()){
                    b.getBatoh().add(shop.get(4));
                    Hrac.setPenize(Hrac.getPenize()-shop.get(4).getCena());
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
        System.out.println("Vítej v mém krámku Hraničáři, zde můžeš prodat vše co vlastníš");
        System.out.println("Obsah tvého batohu: " + b.getBatoh());
        Scanner sc = new Scanner(System.in);
        String prodani = sc.next();
        prodani = prodani.toLowerCase();
        for (int i = 0; i < b.getBatoh().size(); i++) {
            if(prodani.equals(b.getBatoh().get(i).getNazev())){
                Hrac.setPenize(Hrac.getPenize()+b.getBatoh().get(i).getCena());
                b.getBatoh().remove(i);
                System.out.println("Úspěšně prodáno :)");
                return"Batoh: " + b.getBatoh() + " Zlaťáky: " + Hrac.getPenize();
            }



        }
        return "Předmět nenalezen";
    }


}




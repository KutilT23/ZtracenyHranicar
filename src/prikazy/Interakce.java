package prikazy;

import dalsi.Hrac;
import world.WorldMap;

import java.util.Random;
import java.util.Scanner;

public class Interakce extends Command {
    private int nahoda;
    private boolean nalezen = false;
    private boolean splnenUkol1 = false;
    private boolean splnenUkol2 = false;
    private boolean splnenUkol3 = false;
    Batoh batoh = new Batoh();
    private boolean maPavoucioko=false;
    private boolean maPavoucisrdce = false;
    private boolean maVlkodlacitesak = false;
    private boolean maVlkodlacikrev = false;
    private boolean maSirenimelodie = false;
    private boolean maSirenislzy = false;

    @Override
    public String execute() {
        WorldMap wm = new WorldMap();
        int aktualniPozice = wm.getCurrentPosition();
        System.out.println("Aktuální pozice: " + aktualniPozice);

        if(aktualniPozice==1){

            Scanner sc = new Scanner(System.in);

            if(nalezen == false){
                Random rd = new Random();
                nahoda = rd.nextInt(6);
            }else{
                nahoda = 2;
            }
            switch (nahoda) {
                case 0:
                    System.out.println("Nezírejte na mne jako husa do flašky!");
                    break;
                case 1:
                    System.out.println("Ve jménu božím, nechte mě na pokoji!");
                    break;
                case 2:
                    System.out.println("Buď zdráv hraničáři, mé jméno je Ondrigan");
                    nalezen = true;


                    if(splnenUkol1==false){
                        System.out.println("První úkol: Získej PavoučíOko a PavoučíSrdce");
                        for (int i = 0; i < batoh.getBatoh().size(); i++) {
                            if (batoh.getBatoh().get(i).getNazev().equals("pavoucioko")) {
                                maPavoucioko = true;
                            }
                            if (batoh.getBatoh().get(i).getNazev().equals("pavoucisrdce")) {
                                maPavoucisrdce = true;
                            }
                            if (maPavoucioko && maPavoucisrdce) {
                                System.out.println("Ano máš vše, a teď to běž prodat do vedlejšího krámku");
                                splnenUkol1 = true;
                                break;
                            }

                        }


                    }else if(splnenUkol1==true&&splnenUkol2==false){
                        System.out.println("Druhý úkol: Získej VlkodlačíKrev a VlkodlačíTesák ");
                        for (int i = 0; i < batoh.getBatoh().size(); i++) {
                            if (batoh.getBatoh().get(i).getNazev().equals("vlkodlacikrev")) {
                                maVlkodlacikrev = true;
                            }
                            if (batoh.getBatoh().get(i).getNazev().equals("vlkodlacitesak")) {
                                maVlkodlacitesak = true;
                            }
                            if (maVlkodlacikrev && maVlkodlacitesak) {
                                System.out.println("Ano máš vše, a zase to můžeš jít prodat vedle do krámku");
                                splnenUkol2 = true;
                                break;
                            }

                        }

                    }else if(splnenUkol1==true&&splnenUkol2==true&&splnenUkol3==false){
                        System.out.println("Třetí úkol: Získej SireníMelodie a SireníSlzy ");
                        for (int i = 0; i < batoh.getBatoh().size(); i++) {
                            if (batoh.getBatoh().get(i).getNazev().equals("sirenimelodie")) {
                                maSirenimelodie = true;
                            }
                            if (batoh.getBatoh().get(i).getNazev().equals("sirenislzy")) {
                                maSirenislzy = true;
                            }
                            if (maSirenimelodie && maSirenislzy) {
                                System.out.println("Ano máš vše, a za tvojí snahu, zde máš mapu k hradu. Můžeš jí klidně prodat, neboť cesta k hradu " +
                                        "se ti právě odemkla a už ji nepotřebuješ. P.S. Hrad se nachází na jih od Hostince. ");
                                splnenUkol3 = true;
                                WorldMap.maMapu=true;
                                batoh.getBatoh().add(new Predmet("mapa",10));
                                break;
                            }

                        }
                    }else if(splnenUkol1==true&&splnenUkol2==true&&splnenUkol3==true){
                        System.out.println("Již nejsou žádné další úkoly");
                    }
                    break;
                case 3:
                    System.out.println("Ahoj chlapáku, nechceš využít mích služeb?  (ano,ne)");
                    String odpoved = sc.next();
                    odpoved.toLowerCase();
                    while (!odpoved.equals("ano") && !odpoved.equals("ne")) {
                        System.out.println("Není volba (ano, ne)");
                        odpoved = sc.next();
                        odpoved.toLowerCase();
                    }
                    switch (odpoved) {
                        case "ano":
                            System.out.println("Byl si podveden a přišel si o všechny své peníze");
                            Hrac.setPenize(0);
                            System.out.println("Počet aktuálních peněz: " + Hrac.getPenize());
                            break;
                        case "ne":
                            System.out.println("Unikl si podvodu, jsi bystrý chlapík");
                            break;
                        default:
                            return "";


                    }


                    break;
                case 4:
                    System.out.println("S pánem bohem");
                    break;
                case 5:
                    System.out.println("Kdo mnoho mluví, málo činí pane");
                    break;
                default:
                    System.out.println("Chyba v textu");
            }

        }else{
            System.out.println("Nejsi v okolí vesničanů");
        }

        return "";
    }

    public int getNahoda() {
        return nahoda;
    }

    public void setNahoda(int nahoda) {
        this.nahoda = nahoda;
    }

    @Override
    public boolean exit() {
        return false;
    }
}

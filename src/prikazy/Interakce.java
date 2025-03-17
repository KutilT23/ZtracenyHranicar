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
                        System.out.println("První úkol: ");
                        splnenUkol1 = true;
                    }else if(splnenUkol1==true&&splnenUkol2==false){
                        System.out.println("Druhý úkol: ");
                        splnenUkol2 = true;
                    }else if(splnenUkol1==true&&splnenUkol2==true&&splnenUkol3==false){
                        System.out.println("Třetí úkol: ");
                        splnenUkol3 = true;
                    }else if(splnenUkol1==true&&splnenUkol2==true&&splnenUkol3==true){
                        WorldMap.maMapu=true;
                    }
                    break;
                case 3:
                    System.out.println("Ahoj chlapáku, nechceš využít mích služeb?  (ano,ne)");
                    String odpoved = sc.next();
                    odpoved.toLowerCase();
                    switch (odpoved) {
                        case "ano":
                            System.out.println("Byl si podveden a přišel si o všechny své peníze");
                            Hrac.setPenize(0);
                            System.out.println("Počet aktuálních peněz: " + Hrac.getPenize());
                            break;
                        default:
                            System.out.println("Unikl si podvodu, jsi bystrý chlapík");

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

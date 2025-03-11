import prikazy.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Konzole {
    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();
    public static String souborPrikazu = "souborPrikazu.txt";
    public void inicializace(){
        mapa.put("batoh",new Batoh());
        mapa.put("interakce",new Interakce());
        mapa.put("konec",new Konec());
        mapa.put("prikazy",new Prikazy());
        mapa.put("pohyb",new Pohyb());
        mapa.put("pouzit",new PouzitPredmet());
        mapa.put("souboj",new Souboj());
        mapa.put("ukol",new Ukol());
    }

    private Scanner scanner = new Scanner(System.in);
    private void proved(){
        System.out.println("Napište co chcete dělat");
        String prikaz = scanner.nextLine();
        prikaz = prikaz.trim();
        prikaz = prikaz.toLowerCase();
        ulozPrikaz(prikaz);
        if(mapa.containsKey(prikaz)){
            System.out.println(">> "+mapa.get(prikaz).execute());
            exit = mapa.get(prikaz).exit();
        }else{
            System.out.println(">> Nedefinovany prikaz");
        }
    }

    public void start(){
        inicializace();
        try{
            resetSouboru();
            do{
                proved();
            }while(!exit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void ulozPrikaz(String prikaz){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(souborPrikazu,true))){
            bw.write(prikaz);
            bw.newLine();
        }catch(Exception e){

        }
    }

    private void resetSouboru(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(souborPrikazu,false))){
        }catch(Exception e){
        }
    }
}

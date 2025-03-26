package world;

import prikazy.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Konzole {
    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();
    public static String souborPrikazu = "souborPrikazu.txt";
    WorldMap wm = new WorldMap();
    /**
     * metoda pro pridani prikazu do hashmapy
     */
    public void inicializace(){
        mapa.put("batoh",new Batoh());
        mapa.put("interakce",new Interakce());
        mapa.put("konec",new Konec());
        mapa.put("prikazy",new Prikazy());
        mapa.put("pohyb",new Pohyb());
        mapa.put("souboj",new Souboj());
        mapa.put("prodat",new Prodat());
        mapa.put("nakup",new Nakup());
        mapa.put("pribeh",new TextVypis());
    }

    private Scanner scanner = new Scanner(System.in);
    /**
     * metoda pro provedeni prikazu
     */
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
    /**
     * metoda pro start konzole
     */

    public void start(){
        wm.nacistMapu();
        inicializace();
        System.out.println("Vítejte ve hře Ztracený Hraničáč :-D");
        System.out.println("Pro přehled příkazů napište: prikazy");
        try{
            resetSouboru();
            do{
                proved();
            }while(!exit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * metoda pro ulozeni prikazu do textoveho souboru
     */
    private void ulozPrikaz(String prikaz){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(souborPrikazu,true))){
            bw.write(prikaz);
            bw.newLine();
        }catch(Exception e){

        }
    }
    /**
     * metoda pro reset textoveho souboru
     */
    private void resetSouboru(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(souborPrikazu,false))){
        }catch(Exception e){
        }
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }
}

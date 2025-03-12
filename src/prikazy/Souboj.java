package prikazy;
import dalsi.Hrac;
import dalsi.Monstrum;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Souboj extends Command {
    ArrayList<Predmet>vyhra = new ArrayList<>();

    public ArrayList<Predmet> getVyhra() {
        return vyhra;
    }
    Random rd = new Random();
    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvolte si 1-3");
        int currentLocation = 0;
        currentLocation = sc.nextInt();
        Hrac hrac = new Hrac();



        switch (currentLocation){
            case 1:
                Monstrum monstrum = new Monstrum("Pavouk",6,50); //trhlina
                monstrum.pridaniLoot();
                System.out.println("Jsi v souboji s  " + monstrum);
                while (hrac.getZivoty()>0&&monstrum.getZivoty()>0){
                    System.out.println(monstrum.getJmeno() +", " +monstrum.getZivoty());
                    System.out.println(hrac.getZivoty());
                    monstrum.setZivoty(monstrum.getZivoty()- hrac.getSila());
                    if(monstrum.getZivoty()<=0){
                        System.out.println("Vyhral si");

                        vyhra.add(monstrum.getMonstra1().get(rd.nextInt(4)));
                        System.out.println(getVyhra());

                    }
                    hrac.setZivoty(hrac.getZivoty()-monstrum.getSila());
                    if(hrac.getZivoty()<=0){
                        System.out.println("Zemrel jsi");
                    }


                }


            case 2:
                Monstrum monstrum2 = new Monstrum("Vlkodlak",10,120);//les
                monstrum2.pridaniLoot2();
                System.out.println("Jsi v souboji s  " + monstrum2);
                while (hrac.getZivoty()>0&&monstrum2.getZivoty()>0){
                    System.out.println(monstrum2.getJmeno() +", " +monstrum2.getZivoty());
                    System.out.println(hrac.getZivoty());
                    monstrum2.setZivoty(monstrum2.getZivoty()- hrac.getSila());
                    if(monstrum2.getZivoty()<=0){
                        System.out.println("Vyhral si");

                        vyhra.add(monstrum2.getMonstra2().get(rd.nextInt(4)));
                        System.out.println(getVyhra());

                    }
                    hrac.setZivoty(hrac.getZivoty()-monstrum2.getSila());
                    if(hrac.getZivoty()<=0){
                        System.out.println("Zemrel jsi");
                    }
                }
            case 3:
                Monstrum monstrum3 = new Monstrum("Sirena",9,80);    //jezero, polibit moznost = hned smrt?
                monstrum3.pridaniLoot3();
                System.out.println("Jsi v souboji s  " + monstrum3);
                while (hrac.getZivoty()>0&&monstrum3.getZivoty()>0){
                    System.out.println(monstrum3.getJmeno() +", " +monstrum3.getZivoty());
                    System.out.println(hrac.getZivoty());
                    monstrum3.setZivoty(monstrum3.getZivoty()- hrac.getSila());
                    if(monstrum3.getZivoty()<=0){
                        System.out.println("Vyhral si");

                        vyhra.add(monstrum3.getMonstra3().get(rd.nextInt(4)));
                        System.out.println(getVyhra());

                    }
                    hrac.setZivoty(hrac.getZivoty()-monstrum3.getSila());
                    if(hrac.getZivoty()<=0){
                        System.out.println("Zemrel jsi");
                    }


                }

        }

        return "";
    }


    @Override
    public boolean exit() {
        return false;
    }

}

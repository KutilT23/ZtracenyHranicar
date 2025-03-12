package prikazy;

import java.util.Random;
import java.util.Scanner;

public class Interakce extends Command {
    private int nahoda;
    @Override
    public String execute() {

        Scanner sc = new Scanner(System.in);
        boolean nalezen = false;
        String mluveni = sc.next();
        mluveni.toLowerCase();

        if(mluveni.equals("mluvit")){
            if(nalezen == false){
                Random rd = new Random();
                nahoda = rd.nextInt(3);
            }else{
                nahoda = 2;
            }
            switch (nahoda) {
                case 0:
                    System.out.println("Nečum tady na mě");
                case 1:
                    System.out.println("Odpal a neotravuj");
                case 2:
                    System.out.println("Zdravím já jsem Ondrigan");
                    nalezen = true;

            }
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

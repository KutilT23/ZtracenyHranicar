package prikazy;

import world.WorldMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextVypis extends  Command{
    WorldMap wm = new WorldMap();
    @Override
    public String execute() {

        int aktualniPozice = wm.getCurrentPosition();
        System.out.println("Aktuální pozice: " + aktualniPozice);
        switch (aktualniPozice){
            case 0:
                text0();
            break;
            case 1:
                text1();
            break;
            case 2:
                text2();
            break;
            case 5:
                text5();
            break;
            case 6:
                text6();
            break;
            case 7:
                text7();
            break;
            default:
                System.out.println("Chyba načítání");
        }

        return "";
    }
    public void text0() {
        try (BufferedReader br = new BufferedReader(new FileReader("text0.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void text1() {
        try (BufferedReader br = new BufferedReader(new FileReader("text1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void text2() {
        try (BufferedReader br = new BufferedReader(new FileReader("text2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void text5() {
        try (BufferedReader br = new BufferedReader(new FileReader("text5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void text6() {
        try (BufferedReader br = new BufferedReader(new FileReader("text6.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void text7() {
        try (BufferedReader br = new BufferedReader(new FileReader("text7.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}

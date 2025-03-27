package prikazy;

import world.Command;
import world.WorldMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextVypis extends Command {
    WorldMap wm = new WorldMap();
    /**
     * metoda pro spusteni metody na vypis podle aktualni lokace
     */
    @Override
    public String execute() {

        int aktualniPozice = wm.getCurrentPosition();

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
            case 3:
                System.out.println("Pro tuto lokaci žádný příběh neni");
                break;
            case 4:
                System.out.println("Pro tuto lokaci žádný příběh neni ");
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
                return "chyba při načítání";
        }

        return "";
    }
    /**
     * metoda pro nacteni nulteho textoveho souboru
     */
    public void text0() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TextSoubory/text0.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * metoda pro nacteni prvniho textoveho souboru
     */
    public void text1() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TextSoubory/text1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * metoda pro nacteni druheho textoveho souboru
     */
    public void text2() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TextSoubory/text2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * metoda pro nacteni pateho textoveho souboru
     */
    public void text5() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TextSoubory/text5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * metoda pro nacteni sesteho textoveho souboru
     */
    public void text6() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TextSoubory/text6.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * metoda pro nacteni sedmeho textoveho souboru
     */
    public void text7() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TextSoubory/text7.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * metoda pro zjisteni zda program konci
     */
    @Override
    public boolean exit() {
        return false;
    }
}

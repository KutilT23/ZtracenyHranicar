package Testy;

import org.junit.jupiter.api.Test;
import prikazy.Prikazy;

import static org.junit.jupiter.api.Assertions.*;

class PrikazyTest {

    @Test
    void execute() {
        Prikazy prikazy = new Prikazy();
        assertEquals("\n FUNGUJE V KAŽDÉ LOKACI \uD83D\uDDFA\uFE0F:\n   pribeh \uD83D\uDCD6 - vypíše příběh k dané lokaci," +
        "\n   batoh \uD83C\uDF92 - zobrazí hráči nabídku,zda " + "si hráč chce batoh prohlédnout nebo použít nějaký předmět," +
                "\n   konec \uD83D\uDED1 - ukončí hru,\n   pohyb \uD83E\uDDED - zeptá se hráče, " + "kterým směrem chce jít a posune " +
                "ho tím směrem(pokud tam je lokace),\n   prikazy \uD83D\uDCDC - vypiše základní použitelné příkazy ve hře," +
                "\nFUNGUJE JEN V URČITÝCH LOKACÍCH \uD83D\uDCCD\uD83D\uDDFA\uFE0F: \n TRHLINA ⛰\uFE0F,LES \uD83C\uDF32,JEZERO \uD83C\uDF0A, " +
                "HRAD \uD83C\uDFF0\uD83D\uDC32:\n   souboj ⚔\uFE0F - podle lokace, buď započne souboj s " + "monstrem nebo se v lokaci " +
                "monstrum nenachází," + "\n VESNICE:\n   prodat\uD83D\uDCB0 - otevře batoh pokud v něm hráč něco má a hráč " +
                "zvolí co chce prodat," + "\n   nakup \uD83D\uDED2 - pokud má hráč peníze vypíše hráči obsah obchodu a nechá ho si vybrat co chce" +
                "\n   interakce \uD83D\uDCAC - umožní hráči mluvit s vesničany(Hráč se snaží najít vesničana jménem Ondrigan,", prikazy.execute());
    }
}
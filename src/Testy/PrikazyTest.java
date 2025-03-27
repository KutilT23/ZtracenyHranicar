package Testy;

import org.junit.jupiter.api.Test;
import prikazy.Prikazy;

import static org.junit.jupiter.api.Assertions.*;

class PrikazyTest {

    @Test
    void execute() {
        Prikazy prikazy = new Prikazy();
        assertEquals("batoh, interakce, konec, pohyb, prikazy, souboj, prodat, nakup, pribeh", prikazy.execute());
    }
}
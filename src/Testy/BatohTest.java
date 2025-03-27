package Testy;

import prikazy.Batoh;
import dalsi.Predmet;

import static org.junit.jupiter.api.Assertions.*;

class BatohTest {

    @org.junit.jupiter.api.Test
    void getBatoh() {
        Batoh b = new Batoh();
        b.getBatoh().add(new Predmet("mec",2));
        b.getBatoh().add(new Predmet("sekyra",2));
        assertEquals("mec", b.getBatoh().get(0).getNazev());
        assertEquals("sekyra", b.getBatoh().get(1).getNazev());
    }

    @org.junit.jupiter.api.Test
    void getRuka() {
        Batoh b = new Batoh();
        b.getRuka().add(new Predmet("test",2));
        b.getRuka().add(new Predmet("test2",2));
        assertEquals("test", b.getRuka().get(0).getNazev());
        assertEquals("test2", b.getRuka().get(1).getNazev());
    }

}
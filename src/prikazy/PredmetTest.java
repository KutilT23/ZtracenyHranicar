package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazev() {
        Predmet p = new Predmet("mec",2);
        assertEquals("mec", p.getNazev());
    }

    @Test
    void setNazev() {
        Predmet p = new Predmet("mec",2);
        p.setNazev("kladivo");
        assertEquals("kladivo", p.getNazev());

    }

    @Test
    void getSila() {
        Predmet p = new Predmet("mec",2,TypPredmetu.ZBRAN);
        assertEquals(2,p.getSila());
    }

    @Test
    void setSila() {
        Predmet p = new Predmet("mec",2,TypPredmetu.ZBRAN);
        p.setSila(5);
        assertEquals(5,p.getSila());
    }

    @Test
    void getHeal() {
        Predmet p = new Predmet("mec",TypPredmetu.LEKTVARHEAL,50);
        assertEquals(50, p.getHeal());
    }

    @Test
    void setHeal() {
        Predmet p = new Predmet("mec",TypPredmetu.LEKTVARHEAL,50);
        p.setHeal(55);
        assertEquals(55, p.getHeal());

    }
}
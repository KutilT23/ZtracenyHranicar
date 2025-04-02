package Testy;

import org.junit.jupiter.api.Test;
import prikazy.Konec;

import static org.junit.jupiter.api.Assertions.*;

class KonecTest {

    @Test
    void execute() {
        Konec konec = new Konec();
        assertEquals("Hra končí\uD83C\uDFC1...", konec.execute());
    }
}
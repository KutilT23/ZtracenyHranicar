package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KonecTest {

    @Test
    void execute() {
        Konec konec = new Konec();
        assertEquals("Hra končí...", konec.execute());
    }
}
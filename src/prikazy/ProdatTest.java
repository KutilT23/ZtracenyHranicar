package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdatTest {

    @Test
    void execute() {
        Prodat prodat = new Prodat();
        assertEquals("nejsi ve vesnici",prodat.execute());
    }
}
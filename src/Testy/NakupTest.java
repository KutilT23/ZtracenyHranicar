package Testy;

import org.junit.jupiter.api.Test;
import prikazy.Nakup;
import world.WorldMap;

import static org.junit.jupiter.api.Assertions.*;

class NakupTest {

    @Test
    void execute() {
        WorldMap wm = new WorldMap();
        Nakup nakup = new Nakup();
        assertEquals("nejsi ve vesnici",nakup.execute());
    }
}
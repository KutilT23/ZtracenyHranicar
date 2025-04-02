package Testy;

import org.junit.jupiter.api.Test;
import world.WorldMap;

import static org.junit.jupiter.api.Assertions.*;

class WorldMapTest {

    @Test
    void getCurrentPosition() {
        WorldMap wm = new WorldMap();
        wm.nacistMapu();
        assertEquals(0, wm.getCurrentPosition());
    }

    @Test
    void move() {
        WorldMap wm = new WorldMap();
        wm.nacistMapu();
        String smer = "s";
        assertEquals("Přesunuli jste se na lokaci\uD83D\uDCCD\uD83D\uDDFA\uFE0F:  VESNICE", wm.move(smer));
    }
}
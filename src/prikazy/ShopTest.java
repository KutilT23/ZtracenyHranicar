package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void getShop() {
        Shop shop = new Shop();
        shop.pridatVeci();
        assertEquals("sekyra", Shop.getShop().get(0).getNazev());
    }

    @Test
    void pridatVeci() {
        Shop shop = new Shop();
        shop.pridatVeci();
        assertEquals("sekyra", shop.getShop().get(0).getNazev());
        assertEquals("mec", shop.getShop().get(1).getNazev());
        assertEquals("kladivo", shop.getShop().get(2).getNazev());
    }
}
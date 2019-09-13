package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() {
        shop = new Shop("International Instruments");
    }

    @Test
    public void canGetShopName() {
        assertEquals("International Instruments", shop.getName());
    }

    @Test
    public void shopStartsWithNoStock() {
        assertEquals(0, shop.stockCount());
    }
}

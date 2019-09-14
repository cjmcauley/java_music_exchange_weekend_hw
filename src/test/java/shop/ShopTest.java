package shop;

import instruments.Drums;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import properties.InstrumentFamily;
import properties.InstrumentType;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drums drums;
    Guitar guitar;

    @Before
    public void setUp() {
        shop = new Shop("International Instruments");
        drums = new Drums("Tama", InstrumentFamily.PERCUSSION, "Red", "Wood", 299, 650,"Boom", 7, InstrumentType.ACOUSTIC);
        guitar = new Guitar("Fender", InstrumentFamily.STRING, "Black", "Wood", 175, 450, "Strum", 6, InstrumentType.ELECTRIC);

    }

    @Test
    public void canGetShopName() {
        assertEquals("International Instruments", shop.getName());
    }

    @Test
    public void shopStartsWithNoStock() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void addInstrumentToStock() {
        shop.addStock(drums);
        shop.addStock(guitar);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void removeInstrumentFromStock() {
        shop.addStock(drums);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(1, shop.stockCount());
        assertEquals(drums, shop.getInstruments().get(0));
    }

}

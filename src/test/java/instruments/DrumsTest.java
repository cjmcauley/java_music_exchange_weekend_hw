package instruments;

import org.junit.Before;
import org.junit.Test;
import properties.InstrumentFamily;
import properties.InstrumentType;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp() {
        drums = new Drums("Tama", InstrumentFamily.PERCUSSION, "Red", "Wood", 299, 650,"Boom", 7, InstrumentType.ACOUSTIC);
    }

    @Test
    public void canGetModel() {
        assertEquals("Tama", drums.getModel());
    }

    @Test
    public void canGetInstrumentFamily() {
        assertEquals(InstrumentFamily.PERCUSSION, drums.getFamily());
    }

    @Test
    public void canGetInstrumentColour() {
        assertEquals("Red", drums.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Wood", drums.getMaterial());
    }

    @Test
    public void canGetInstrumentPurchasePrice() {
        assertEquals(299, drums.getPurchasePrice());
    }

    @Test
    public void canGetInstrumentRetailPrice() {
        assertEquals(650, drums.getRetailPrice());
    }

    @Test
    public void canGetInstrumentSound() {
        assertEquals("Boom", drums.getSound());
    }

    @Test
    public void canGetNoOfDrums() {
        assertEquals(7, drums.getNoOfDrums());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.ACOUSTIC, drums.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Boom, that sounds like a drum", drums.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(351, drums.calculateMarkup());
    }
}

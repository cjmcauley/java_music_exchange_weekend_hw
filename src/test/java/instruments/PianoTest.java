package instruments;

import org.junit.Before;
import org.junit.Test;
import properties.InstrumentFamily;
import properties.InstrumentType;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steinway", InstrumentFamily.PERCUSSION, "Black", "Wood", 800, 1950, "Ting", 88);
    }

    @Test
    public void canGetModel() {
        assertEquals("Steinway", piano.getModel());
    }

    @Test
    public void canGetInstrumentFamily() {
        assertEquals(InstrumentFamily.PERCUSSION, piano.getFamily());
    }

    @Test
    public void canGetInstrumentColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canGetInstrumentPurchasePrice() {
        assertEquals(800, piano.getPurchasePrice());
    }

    @Test
    public void canGetInstrumentRetailPrice() {
        assertEquals(1950, piano.getRetailPrice());
    }

    @Test
    public void canGetInstrumentSound() {
        assertEquals("Ting", piano.getSound());
    }

    @Test
    public void canGetNoOfKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Ting, that sounds like a piano", piano.play());
    }

}

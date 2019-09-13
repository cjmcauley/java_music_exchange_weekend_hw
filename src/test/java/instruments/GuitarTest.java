package instruments;

import org.junit.Before;
import org.junit.Test;
import properties.InstrumentFamily;
import properties.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Fender", InstrumentFamily.STRING, "Black", "Wood", 175, 450, "Strum", 6, InstrumentType.ELECTRIC);
    }

    @Test
    public void canGetModel() {
        assertEquals("Fender", guitar.getModel());
    }

    @Test
    public void canGetInstrumentFamily() {
        assertEquals(InstrumentFamily.STRING, guitar.getFamily());
    }

    @Test
    public void canGetInstrumentColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetInstrumentPurchasePrice() {
        assertEquals(175, guitar.getPurchasePrice());
    }

    @Test
    public void canGetInstrumentRetailPrice() {
        assertEquals(450, guitar.getRetailPrice());
    }

    @Test
    public void canGetInstrumentSound() {
        assertEquals("Strum", guitar.getSound());
    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, guitar.getStrings());
    }


    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.ELECTRIC, guitar.getType());
    }

}

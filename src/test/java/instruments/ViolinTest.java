package instruments;

import org.junit.Before;
import org.junit.Test;
import properties.InstrumentFamily;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp(){
        violin = new Violin("Stentor", InstrumentFamily.STRING, "Brown", "Wood", 195, 475, 6);
    }

    @Test
    public void canGetModel() {
        assertEquals("Stentor", violin.getModel());
    }

    @Test
    public void canGetInstrumentFamily() {
        assertEquals(InstrumentFamily.STRING, violin.getFamily());
    }

    @Test
    public void canGetInstrumentColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void canGetInstrumentPurchasePrice() {
        assertEquals(195, violin.getPurchasePrice());
    }


    @Test
    public void canGetInstrumentRetailPrice() {
        assertEquals(475, violin.getRetailPrice());
    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, violin.getStrings());
    }

}

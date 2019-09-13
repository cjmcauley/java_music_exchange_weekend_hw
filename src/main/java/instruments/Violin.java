package instruments;

import properties.InstrumentFamily;

public class Violin extends Instrument {

    private int strings;

    public Violin(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, int strings) {
        super(model, family, colour, material, purchasePrice, retailPrice);
        this.strings = strings;
    }
}

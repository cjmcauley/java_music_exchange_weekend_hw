package instruments;

import properties.InstrumentFamily;

public class Piano extends Instrument {

    private int keys;

    public Piano(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, int keys) {
        super(model, family, colour, material, purchasePrice, retailPrice);
        this.keys = keys;
    }
}

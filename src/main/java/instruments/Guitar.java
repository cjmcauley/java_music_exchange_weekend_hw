package instruments;

import properties.InstrumentFamily;
import properties.InstrumentType;

public class Guitar extends Instrument {

    private int strings;
    private InstrumentType type;

    public Guitar(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, int strings, InstrumentType type) {
        super(model, family, colour, material, purchasePrice, retailPrice);
        this.strings = strings;
        this.type = type;
    }
}

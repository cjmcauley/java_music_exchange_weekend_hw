package instruments;

import properties.InstrumentFamily;

public class Piano extends Instrument {

    private int keys;

    public Piano(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, String sound, int keys) {
        super(model, family, colour, material, purchasePrice, retailPrice, sound);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}

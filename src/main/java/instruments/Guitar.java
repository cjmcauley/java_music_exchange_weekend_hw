package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import properties.InstrumentFamily;
import properties.InstrumentType;

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;
    private InstrumentType type;

    public Guitar(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, String sound, int strings, InstrumentType type) {
        super(model, family, colour, material, purchasePrice, retailPrice, sound);
        this.strings = strings;
        this.type = type;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String play() {
        return getSound() + ", that sounds like a guitar";
    }

    public int calculateMarkup() {
        return getRetailPrice() - getPurchasePrice();
    }
}

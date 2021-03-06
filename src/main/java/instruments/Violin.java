package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import properties.InstrumentFamily;

public class Violin extends Instrument implements IPlay, ISell {

    private int strings;

    public Violin(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, String sound, int strings) {
        super(model, family, colour, material, purchasePrice, retailPrice, sound);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String play() {
        return getSound() + ", that sounds like a violin";
    }

    public int calculateMarkup() {
        return getRetailPrice() - getPurchasePrice();
    }
}

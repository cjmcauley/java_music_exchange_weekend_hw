package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import properties.InstrumentFamily;
import properties.InstrumentType;

public class Drums extends Instrument implements IPlay, ISell {

    private int noOfDrums;
    private InstrumentType type;

    public Drums(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, String sound, int noOfDrums, InstrumentType type) {
        super(model, family, colour, material, purchasePrice, retailPrice, sound);
        this.noOfDrums = noOfDrums;
        this.type = type;
    }

    public int getNoOfDrums() {
        return noOfDrums;
    }

    public void setNoOfDrums(int noOfDrums) {
        this.noOfDrums = noOfDrums;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String play() {
        return getSound() + ", that sounds like a drum";
    }

    public int calculateMarkup() {
        return getRetailPrice() - getPurchasePrice();
    }
}

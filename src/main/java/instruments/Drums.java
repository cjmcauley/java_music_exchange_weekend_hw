package instruments;

import properties.InstrumentFamily;
import properties.InstrumentType;

public class Drums extends Instrument {

    private int noOfDrums;
    private InstrumentType type;

    public Drums(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, int noOfDrums, InstrumentType type) {
        super(model, family, colour, material, purchasePrice, retailPrice);
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
}

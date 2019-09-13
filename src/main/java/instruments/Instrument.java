package instruments;

import properties.InstrumentFamily;

public class Instrument {

    private String model;
    private InstrumentFamily family;
    private String colour;
    private String material;
    private int purchasePrice;
    private int retailPrice;

    public Instrument(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice) {
        this.model = model;
        this.family = family;
        this.colour = colour;
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
    }
}


package instruments;

import properties.InstrumentFamily;

public abstract class Instrument {

    private String model;
    private InstrumentFamily family;
    private String colour;
    private String material;
    private int purchasePrice;
    private int retailPrice;
    private String sound;

    public Instrument(String model, InstrumentFamily family, String colour, String material, int purchasePrice, int retailPrice, String sound) {
        this.model = model;
        this.family = family;
        this.colour = colour;
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public void setFamily(InstrumentFamily family) {
        this.family = family;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int calculateMarkup() {
        return getRetailPrice() - getPurchasePrice();
    }
}


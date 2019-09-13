package shop;

import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instrument> instruments;

    public Shop(String name) {
        this.name = name;
        this.instruments = new ArrayList<Instrument>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public int stockCount(){
        return getInstruments().size();
    }
}

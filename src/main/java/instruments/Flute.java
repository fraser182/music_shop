package instruments;

import behaviours.IPlay;


public class Flute extends Instrument implements IPlay {

        private int numberOfTubes;
        private String material;


    public Flute(String itemName, String make, String model, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfTubes, String material) {
        super(itemName, make, model, colour, instrumentType, buyPrice, sellPrice);
        this.numberOfTubes = numberOfTubes;
        this.material = material;

    }


    public int getNumberOfTubes() {
        return this.numberOfTubes;
    }

    public String getMaterial() {
        return this.material;
    }

    public String play(){
        return "blow-eeyyyy sound";
    }

}

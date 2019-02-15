package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class DrumKit extends Instrument implements ISell, IPlay {

    private int bassDrumSize;
    private int numberOfToms;
    private String shellMaterial;


    public DrumKit(String itemName, String make, String model, String colour, InstrumentType instrumentType,
                   double buyPrice, double sellPrice, int bassDrumSize, int numberOfToms, String shellMaterial) {
        super(itemName, make, model, colour, instrumentType, buyPrice, sellPrice);
        this.bassDrumSize = bassDrumSize;
        this.numberOfToms = numberOfToms;
        this.shellMaterial = shellMaterial;
    }


    public int getBassDrumSize() {
        return this.bassDrumSize;
    }


    public int getNumberOfToms() {
        return this.numberOfToms;
    }


    public String getShellMaterial() {
        return this.shellMaterial;
    }

    public String play(){
        return "Ba da Boom";
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}

package instruments;

import behaviours.IPlay;
import behaviours.ISell;


public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;
    private String neckMaterialType;
    private String bodyMaterialType;

    public Guitar(String itemName, String make, String model, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfStrings, String neckMaterialType, String bodyMaterialType) {
        super(itemName, make, model, colour, instrumentType, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.neckMaterialType = neckMaterialType;
        this.bodyMaterialType = bodyMaterialType;
    }


    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String getNeckMaterialType() {
        return this.neckMaterialType;
    }

    public String getBodyMaterialType() {
        return this.bodyMaterialType;
    }

    public String play(){
        return "bwow-chcka-bwow";
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice();
    }


}

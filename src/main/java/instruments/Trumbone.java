package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumbone extends Instrument implements IPlay, ISell {

    private String variety;


    public Trumbone(String itemName, String make, String model, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, String variety) {
        super(itemName, make, model, colour, instrumentType, buyPrice, sellPrice);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public String play(){
        return "sliiiaaaaayyyyyddeee";
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}

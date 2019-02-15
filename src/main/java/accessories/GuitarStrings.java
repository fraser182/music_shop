package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessory implements ISell {

    public GuitarStrings(String name, String type, double buyPrice, double sellPrice) {
        super(name, type, buyPrice, sellPrice);
    }
    public double calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice();
    }
}

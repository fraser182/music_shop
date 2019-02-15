package accessories;

import behaviours.ISell;

public class DrumSticks extends Accessory implements ISell {

    public DrumSticks(String name, String type, double buyPrice, double sellPrice) {
        super(name, type, buyPrice, sellPrice);
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}

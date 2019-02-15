package accessories;

import behaviours.ISell;

public class SheetMusic extends Accessory implements ISell {

    private String title;
    private String author;

    public SheetMusic(String name, String type, String title, String author, double buyPrice, double sellPrice) {
        super(name, type, buyPrice, sellPrice);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice();
    }
}

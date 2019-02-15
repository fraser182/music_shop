package accessories;


public abstract class Accessory {

    private String name;
    private String type;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String name, String type, double buyPrice, double sellPrice) {
        this.name = name;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }


}

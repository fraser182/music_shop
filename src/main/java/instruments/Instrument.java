package instruments;

public abstract class Instrument{

    private String itemName;
    private String make;
    private String model;
    private String colour;
    private InstrumentType instrumentType;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String itemName, String make, String model,String colour, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        this.itemName = itemName;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }



}

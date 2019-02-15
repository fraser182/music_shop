import behaviours.ISell;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

//    public ArrayList<ISell> getStock() {
//        return stock;
//    }


    public int stockCount() {
        return this.stock.size();
    }


    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        ISell itemFound = null;
        for (ISell iSell : this.stock) {
            if (iSell == item)
                itemFound = item;
        }
        this.stock.remove(itemFound);
    }

//        public ISell removeStock(ISell item){
//        int index = this.stock.indexOf(item);
//        return this.stock.remove(index);
//    }

    public boolean checkItemIsInStock(ISell item) {
        return this.stock.contains(item);
    }

    public double showTotalPotentialProfit() {
        int total = 0;
        for (ISell item : this.stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}

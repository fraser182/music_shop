import accessories.DrumSticks;
import accessories.GuitarStrings;
import accessories.SheetMusic;
import instruments.DrumKit;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumbone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    DrumKit drumKit;
    SheetMusic sheetMusic;
    Trumbone trumbone;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;


    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar ("Guitar", "Fender", "American Stratocaster Standard", "Artic White",
                InstrumentType.STRING, 359.99, 699.99, 6, "Maple",
                "Alder");
        drumKit = new DrumKit("Drum Kit", "Sonor", "SQ2", "Brown", InstrumentType.PERCUSSION, 2500.00, 4200.00, 20, 1, "Maple");
        sheetMusic = new SheetMusic("Music Sheets", "Paperback", "The Greatest Showman", "Benj Pasek and Justin Paul", 4.50, 10.00);
        trumbone = new Trumbone("Trumbone", "Yamaha", "YSL-891Z", "Gold", InstrumentType.BRASS, 450.00, 1000.00, "Tenor");
        drumSticks = new DrumSticks("Drumsticks", "Vic Firth American Custom SD1", 2.00, 7.50);
        guitarStrings = new GuitarStrings("Guitar Strings", "Ernie Ball Regular Slinky", 2.10, 6.50);

    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange",  shop.getName());
    }

    @Test
    public void canCheckStockForSaleIsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStockForSale(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStockForSale(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
        shop.removeStock(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canCheckItemIsInStock(){
        shop.addStock(guitar);
        shop.addStock(drumKit);
        shop.addStock(guitarStrings);
        assertEquals(3, shop.stockCount());
        assertEquals(true, shop.checkItemIsInStock(guitarStrings));
    }

    @Test
    public void canCheckItemIsNotStock(){
        shop.addStock(guitar);
        shop.addStock(drumKit);
        shop.addStock(guitarStrings);
        assertEquals(3, shop.stockCount());
        assertEquals(false, shop.checkItemIsInStock(trumbone));
    }

    @Test
    public void canShowTotalPotentialProfit(){
        shop.addStock(guitar);
        shop.addStock(drumKit);
        shop.addStock(guitarStrings);
        assertEquals(3, shop.stockCount());
        assertEquals(2044.00, shop.showTotalPotentialProfit(),0.01);
    }
}

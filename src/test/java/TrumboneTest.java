import instruments.InstrumentType;
import instruments.Trumbone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumboneTest {

    Trumbone trumbone;

    @Before
    public void before(){
        trumbone = new Trumbone("Trumbone", "Yamaha", "YSL-891Z", "Gold", InstrumentType.BRASS, 450.00, 1000.00, "Tenor");

    }

    @Test
    public void hasItemName(){
        assertEquals("Trumbone", trumbone.getItemName());
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", trumbone.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("YSL-891Z", trumbone.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", trumbone.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumbone.getInstrumentType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(450.00, trumbone.getBuyPrice(), 0.01);

    }

    @Test
    public void hasSellPrice(){
        assertEquals( 1000.00, trumbone.getSellPrice(), 0.01);
    }

    @Test
    public void hasVariety(){
        assertEquals("Tenor", trumbone.getVariety());
    }

    @Test
    public void hasPlay(){
        assertEquals("sliiiaaaaayyyyyddeee", trumbone.play());
    }


    @Test
    public void hasCalculateMarkup(){
        assertEquals(550.00, trumbone.calculateMarkup(), 0.01);
    }
}


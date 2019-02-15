import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {


    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Guitar Strings", "Ernie Ball Regular Slinky", 2.10, 6.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Guitar Strings", guitarStrings.getName());
    }

    @Test
    public void canGetType(){
        assertEquals("Ernie Ball Regular Slinky", guitarStrings.getType());
    }

    @Test
    public void canBuyPrice(){
        assertEquals(2.10, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test
    public void canSellPrice(){
        assertEquals(6.50, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void hasCalculateMarkup(){
        assertEquals(4.40, guitarStrings.calculateMarkup(), 0.01);
    }
}

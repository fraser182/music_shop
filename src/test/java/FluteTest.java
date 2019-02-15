import instruments.Flute;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Flute", "Yamaha", "YFL222", "Silver", InstrumentType.WOODWIND, 220.50, 550.00, 1, "Nickel");
    }

    @Test
    public void hasItemName(){
        assertEquals("Flute", flute.getItemName());
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", flute.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("YFL222", flute.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Silver", flute.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, flute.getInstrumentType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(220.50, flute.getBuyPrice(), 0.01);

    }

    @Test
    public void hasSellPrice(){
        assertEquals( 550.00, flute.getSellPrice(), 0.01);
    }

    @Test
    public void hasNumberOfTubes(){
        assertEquals(1, flute.getNumberOfTubes());

    }

    @Test
    public void hasMaterial(){
        assertEquals("Nickel", flute.getMaterial());
    }

    @Test
    public void hasPlay(){
        assertEquals("blow-eeyyyy sound", flute.play());
    }

}

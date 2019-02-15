import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before(){
        guitar = new Guitar("Guitar", "Fender", "American Stratocaster Standard", "Artic White",
                InstrumentType.STRING, 359.99, 699.99, 6, "Maple",
                "Alder");
    }

    @Test
    public void hasItemName() {
        assertEquals("Guitar", guitar.getItemName());
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("American Stratocaster Standard", guitar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Artic White", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(359.99, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(699.99, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasNeckMaterialType(){
        assertEquals("Maple", guitar.getNeckMaterialType());
    }

    @Test
    public void hasBodyMaterialType(){
        assertEquals("Alder", guitar.getBodyMaterialType());
    }

    @Test
    public void hasPlay(){
        assertEquals("bwow-chcka-bwow", guitar.play());
    }

    @Test
    public void hasCalculateMarkup(){
        assertEquals(340.00, guitar.calculateMarkup(), 0.01);
    }
}

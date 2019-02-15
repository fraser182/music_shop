import instruments.DrumKit;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void before(){
        drumKit = new DrumKit("Drum Kit", "Sonor", "SQ2", "Brown", InstrumentType.PERCUSSION, 2500.00, 4200.00, 20, 1, "Maple");
    }

    @Test
    public void hasItemName(){
        assertEquals("Drum Kit", drumKit.getItemName());
    }

    @Test
    public void hasMake(){
        assertEquals("Sonor", drumKit.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("SQ2", drumKit.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", drumKit.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drumKit.getInstrumentType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(2500.00, drumKit.getBuyPrice(), 0.01);

    }

    @Test
    public void hasSellPrice(){
        assertEquals( 4200.00, drumKit.getSellPrice(), 0.01);
    }

    @Test
    public void hasBassDrumSize(){
        assertEquals(20, drumKit.getBassDrumSize());

    }

    @Test
    public void hasNumberOfToms(){
        assertEquals(1, drumKit.getNumberOfToms());
    }

    @Test
    public void hasShellMaterial(){
        assertEquals("Maple", drumKit.getShellMaterial());
    }

    @Test
    public void play(){
        assertEquals("Ba da Boom", drumKit.play());
    }

    @Test
    public void hasCalculateMarkup(){
        assertEquals(1700.00, drumKit.calculateMarkup(), 0.01);
    }
}

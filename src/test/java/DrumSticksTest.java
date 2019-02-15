import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drumsticks", "Vic Firth American Custom SD1", 2.00, 7.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Drumsticks", drumSticks.getName());
    }

    @Test
    public void canGetType(){
        assertEquals("Vic Firth American Custom SD1", drumSticks.getType());
    }

    @Test
    public void canBuyPrice(){
        assertEquals(2.00, drumSticks.getBuyPrice(), 0.01);
    }

    @Test
    public void canSellPrice(){
        assertEquals(7.50, drumSticks.getSellPrice(), 0.01);
    }

    @Test
    public void hasCalculateMarkup(){
        assertEquals(5.50, drumSticks.calculateMarkup(), 0.01);
    }


}

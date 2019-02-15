import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;


    @Before
    public void before(){
        sheetMusic = new SheetMusic("Music Sheets", "Paperback", "The Greatest Showman", "Benj Pasek and Justin Paul", 4.50, 10.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Music Sheets", sheetMusic.getName());
    }

    @Test
    public void canGetType(){
        assertEquals("Paperback", sheetMusic.getType());
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Greatest Showman", sheetMusic.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Benj Pasek and Justin Paul", sheetMusic.getAuthor());
    }

    @Test
    public void canBuyPrice(){
        assertEquals(4.50, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canSellPrice(){
        assertEquals(10.00, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void hasCalculateMarkup(){
        assertEquals(5.50, sheetMusic.calculateMarkup(), 0.01);
    }
}

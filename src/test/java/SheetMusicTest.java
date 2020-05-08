import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Urtext", "Chopin", "Waltzes", 5, 5.50);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(5.50, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(5, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetName() {
        assertEquals("Waltzes", sheetMusic.getName());
    }

    @Test
    public void canGetComposer() {
        assertEquals("Chopin", sheetMusic.getComposer());
    }

    @Test
    public void canGetPublisher() {
        assertEquals("Urtext", sheetMusic.getPublisher());
    }

    @Test
    public void canCalculateMarkup(){
      assertEquals(0.1, sheetMusic.calculateMarkup(), 0.01);
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicShopTest {

    private Piano piano;
    private Guitar guitar;
    private SheetMusic sheetMusic;
    private MusicShop musicShop;

    @Before
    public void setUp(){
        piano = new Piano("blue", "wood", "percussion", 10000, 11000, 88, "Steinway", 3);
        guitar = new Guitar("golden brown", "wood", "string", 5000, 5500, 6, "classical");
        sheetMusic = new SheetMusic("Urtext", "Chopin", "Waltzes", 5, 5.50);
        musicShop = new MusicShop();
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canAddInstrumentsToStock() {
        musicShop.addToStock(piano);
        assertEquals(1, musicShop.getStock().size());
        musicShop.addToStock(guitar);
        assertEquals(2, musicShop.getStock().size());
        musicShop.addToStock(sheetMusic);
        assertEquals(3, musicShop.getStock().size());
    }

    @Test
    public void canRemoveInstrumentFromStock() {
        musicShop.addToStock(piano);
        musicShop.addToStock(guitar);
        musicShop.addToStock(sheetMusic);
        musicShop.removeFromStock(piano);
        musicShop.removeFromStock(guitar);
        musicShop.removeFromStock(sheetMusic);
        assertEquals(0, musicShop.getStock().size());
    }
}

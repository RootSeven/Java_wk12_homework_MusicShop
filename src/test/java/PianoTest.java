import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("blue", "wood", "percussion", 10000, 11000, 88, "Steinway", 3);
    }

    @Test
    public void canGetNumberOfPedals() {
        assertEquals(3, piano.getNumberOfPedals());
    }

    @Test
    public void canGetPianoType() {
        assertEquals("Steinway", piano.getPianoType());
    }

    @Test
    public void canGetNymberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetColour() {
        assertEquals("blue", piano.getColour());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(11000, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(10000, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentFamily() {
        assertEquals("percussion", piano.getInstrumentFamily());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", piano.getMainMaterial());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.10, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlayPiano() {
        assertEquals("doooo...", piano.play());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;
    
    @Before
    public void setUp() {
        guitar = new Guitar("golden brown", "wood", "string", 5000, 5500, 6, "classical");
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("classical", guitar.getGuitarType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(5500, guitar.getSellPrice(),0.01);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(5000, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentFamily() {
        assertEquals("string", guitar.getInstrumentFamily());
    }

    @Test
    public void canGetColour() {
        assertEquals("golden brown", guitar.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", guitar.getMainMaterial());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.10, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("brrring...", guitar.play());
    }
}

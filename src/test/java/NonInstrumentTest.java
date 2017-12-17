import NonInstruments.Drumsticks;
import NonInstruments.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NonInstrumentTest {

    Drumsticks drumsticks;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        drumsticks = new Drumsticks("Vic Firth", 2.00, 5.00, 20);
        sheetMusic = new SheetMusic("O Fortuna", 1.00, 3.50, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Vic Firth", drumsticks.getName());
        assertEquals("O Fortuna", sheetMusic.getName());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(2.00, drumsticks.getBuyPrice(), 0.01);
        assertEquals(1.00, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(5.00, drumsticks.getSellPrice(), 0.01);
        assertEquals(3.50, sheetMusic.getSellPrice(),0.01);
    }

    @Test
    public void canGetQuantity(){
        assertEquals(20, drumsticks.getQuantity());
        assertEquals(5, sheetMusic.getQuantity());
    }

    @Test
    public void canSetQuantity() {
        drumsticks.setQuantity(0);
        sheetMusic.setQuantity(0);
        assertEquals(0, drumsticks.getQuantity());
        assertEquals(0, sheetMusic.getQuantity());
    }

    @Test
    public void canSell(){
        assertEquals("item sold", drumsticks.sell());
        assertEquals("item sold", sheetMusic.sell());
    }

    @Test
    public void cantSell(){
        drumsticks.setQuantity(0);
        sheetMusic.setQuantity(0);
        assertEquals("item out of stock", drumsticks.sell());
        assertEquals("item out of stock", sheetMusic.sell());
    }

    @Test
    public void canGetMarkup(){
        assertEquals("250.0%", drumsticks.getMarkup());
        assertEquals("350.0%", sheetMusic.getMarkup());
    }

}

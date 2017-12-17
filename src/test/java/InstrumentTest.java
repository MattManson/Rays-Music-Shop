import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InstrumentTest {

    Guitar guitar;
    Saxophone saxophone;
    Drumkit drumkit;
    Keyboard keyboard;

    @Before
    public void before(){
        guitar = new Guitar("Gibson Les Paul", InstrumentType.GUITAR, "Sunburst", "Mahogany", 4000.00, 2500, 12, 6);
        saxophone = new Saxophone("Yamaha YAS280S", InstrumentType.SAXOPHONE, "Silver-plated", "Brass", 1056.00, 670.00, 8,23);
        drumkit = new Drumkit("Premier Cabria", InstrumentType.DRUMKIT, "Pearl", "Maple", 560.00, 300.00, 30, 5);
        keyboard = new Keyboard("Yamaha Genos", InstrumentType.KEYBOARD, "Black", "Carbon Fibre", 5500.00, 4000, 4, 76);
    }

    @Test
    public void cangetModel(){
        assertEquals("Gibson Les Paul", guitar.getModel());
    }

    @Test
    public void canSetModel(){
        guitar.setModel("Gibson Flying V");
        assertEquals("Gibson Flying V", guitar.getModel());
    }
    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
        assertEquals(InstrumentType.SAXOPHONE, saxophone.getInstrumentType());
        assertEquals(InstrumentType.KEYBOARD, keyboard.getInstrumentType());
        assertEquals(InstrumentType.DRUMKIT, drumkit.getInstrumentType());
    }

    @Test
    public void canGetPrettyname(){
        assertEquals("guitar", guitar.prettyName());
        assertEquals("saxophone", saxophone.prettyName());
        assertEquals("drumkit", drumkit.prettyName());
        assertEquals("keyboard", keyboard.prettyName());
    }

    @Test
    public void canGetattributes(){
        assertEquals(23, saxophone.getValves());
        assertEquals(6, guitar.getStringNum());
        assertEquals(76, keyboard.getNumKeys());
        assertEquals(5, drumkit.getNumPieces());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plink", keyboard.play());
        assertEquals("shred", guitar.play());
        assertEquals("toot toot", saxophone.play());
        assertEquals("ba-dum-tsss", drumkit.play());
    }

    @Test
    public void canSell(){
        assertEquals("item sold", saxophone.sell());
        assertEquals("item sold", guitar.sell());
    }

    @Test
    public void cantSell(){
        saxophone.setQuantity(0);
        guitar.setQuantity(0);
        assertEquals("item out of stock", saxophone.sell());
        assertEquals("item out of stock", guitar.sell());
    }

    @Test
    public void canGetMarkup(){
        assertEquals("160.0%", guitar.getMarkup());
        assertEquals("186.66666666666666%", drumkit.getMarkup());
    }

    @Test
    public void canGetProfit(){
        assertEquals(18000.0, guitar.getProfit(),0.01);
        assertEquals(3088, saxophone.getProfit(),0.01);
        assertEquals(7800, drumkit.getProfit(),0.01);
        assertEquals(6000, keyboard.getProfit(),0.01);
    }

}

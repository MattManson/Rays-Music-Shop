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





}

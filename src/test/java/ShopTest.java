import Instruments.*;
import NonInstruments.*;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Saxophone saxophone;
    Drumkit drumkit;
    Keyboard keyboard;
    Drumsticks drumsticks;
    SheetMusic sheetMusic;

    @Before
    public void before(){

        shop = new Shop("Ray's Music Shop");

        guitar = new Guitar("Gibson Les Paul", InstrumentType.GUITAR, "Sunburst", "Mahogany", 4000.00, 2500, 12, 6);
        saxophone = new Saxophone("Yamaha YAS280S", InstrumentType.SAXOPHONE, "Silver-plated", "Brass", 1056.00, 670.00, 8,23);
        drumkit = new Drumkit("Premier Cabria", InstrumentType.DRUMKIT, "Pearl", "Maple", 560.00, 300.00, 30, 5);
        keyboard = new Keyboard("Yamaha Genos", InstrumentType.KEYBOARD, "Black", "Carbon Fibre", 5500.00, 4000, 4, 76);
        drumsticks = new Drumsticks("Vic Firth", 2.00, 5.00, 20);
        sheetMusic = new SheetMusic("O Fortuna", 1.00, 3.50, 5);

        shop.addItems(guitar);
        shop.addItems(saxophone);
        shop.addItems(drumkit);
        shop.addItems(keyboard);
        shop.addItems(drumsticks);
        shop.addItems(sheetMusic);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Shop", shop.getName());
    }

    @Test
    public void canSetName(){
        shop.setName("Ray's Music Exchange");
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canGetProfit(){
        assertEquals(34960.5, shop.totalProfit(),0.01);
    }








}

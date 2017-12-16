package Instruments;

public class Keyboard extends Instrument {

    private int numKeys;
    private String playSound;

    public Keyboard(String model, InstrumentType instrumentType, String colour, String material, double sellPrice, double buyprice, int quantity, int numKeys) {
        super(model, instrumentType, colour, material, sellPrice, buyprice, quantity);
        this.numKeys = numKeys;
        this.playSound = "plink plink";
    }

    public int getNumKeys() {
        return numKeys;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    public String play() {
        return this.playSound;
    }
}

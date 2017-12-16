package Instruments;

public class Guitar extends Instrument {

    private int stringNum;
    private String playSound;

    public Guitar(String model, InstrumentType instrumentType, String colour, String material, double sellPrice, double buyprice, int quantity, int stringNum) {
        super(model, instrumentType, colour, material, sellPrice, buyprice, quantity);
        this.stringNum = stringNum;
        this.playSound = "shred";
    }

    public int getStringNum() {
        return stringNum;
    }

    public void setStringNum(int stringNum) {
        this.stringNum = stringNum;
    }

    public String play() {
        return this.playSound;
    }
}

package Instruments;

public class Drumkit extends Instrument {

    private int numPieces;
    private String playSound;

    public Drumkit(String model, InstrumentType instrumentType, String colour, String material, double sellPrice, double buyprice, int quantity, int numPieces) {
        super(model, instrumentType, colour, material, sellPrice, buyprice, quantity);
        this.numPieces = numPieces;
        this.playSound = "ba-dum-tsss";
    }

    public int getNumPieces() {
        return numPieces;
    }

    public void setNumPieces(int numPieces) {
        this.numPieces = numPieces;
    }

    public String play() {
        return this.playSound;
    }
}

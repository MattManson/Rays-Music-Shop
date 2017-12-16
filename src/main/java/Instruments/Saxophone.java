package Instruments;

public class Saxophone extends Instrument {

    private int valves;
    private String playSound;

    public Saxophone(String model, InstrumentType instrumentType, String colour, String material, double sellPrice, double buyprice, int quantity, int valves) {
        super(model, instrumentType, colour, material, sellPrice, buyprice, quantity);
        this.valves = valves;
        this.playSound = "toot toot";
    }

    public String play() {
        return this.playSound;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }
}

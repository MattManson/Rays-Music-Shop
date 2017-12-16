package Instruments;

public abstract class Instrument implements IPlay {


    private String model;
    private InstrumentType instrumentType;
    private String colour;
    private String material;
    private double sellPrice;
    private double buyprice;
    private int quantity;

    public Instrument(String model, InstrumentType instrumentType, String colour, String material, double sellPrice, double buyprice, int quantity){
        this.model = model;
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.sellPrice = sellPrice;
        this.buyprice = buyprice;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String play() {
        return null;
    }
}

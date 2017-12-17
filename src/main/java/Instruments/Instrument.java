package Instruments;

import Shop.ISell;

public abstract class Instrument implements IPlay, ISell {


    private String model;
    private InstrumentType instrumentType;
    private String colour;
    private String material;
    private double sellPrice;
    private double buyPrice;
    private int quantity;

    public Instrument(String model, InstrumentType instrumentType, String colour, String material, double sellPrice, double buyPrice, int quantity){
        this.model = model;
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
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
        return buyPrice;
    }

    public void setBuyprice(double buyprice) {
        this.buyPrice = buyprice;
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

    public String getMarkup() {
        return sellPrice/buyPrice *100 + "%";
    }

    public String sell() {
        if(this.quantity > 0){
            int result = this.quantity -1;
            this.setQuantity(result);
            return "item sold";
        }
        else return "item out of stock";
    }

    public double getProfit() {
        return ((sellPrice - buyPrice)* quantity);
    }

    public String prettyName() {
        return this.instrumentType.getType();
    }
}

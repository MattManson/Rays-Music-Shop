package NonInstruments;

import Shop.ISell;

public abstract class NonInstrument implements ISell {

    private String name;
    private double buyPrice;
    private double sellPrice;
    protected int quantity;


    public NonInstrument(String name, double buyPrice, double sellPrice, int quantity){
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMarkup() {
        return sellPrice/buyPrice *100 + "%";
    }
}
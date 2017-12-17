package NonInstruments;

public class SheetMusic extends NonInstrument {

    public SheetMusic(String name, double buyPrice, double sellPrice, int quantity) {
        super(name, buyPrice, sellPrice, quantity);
    }

    public String sell() {
        if(this.quantity > 0){
            return "item sold";}
        else return "item out of stock";
    }


}

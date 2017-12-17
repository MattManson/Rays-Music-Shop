package Shop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> items;


    public Shop(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getItems() {
        return items;
    }

    public void addItems(ISell items) {
        this.items.add(items);
    }

    public double totalProfit() {
        double value = 0;
        for(ISell item:items){
            value += item.getProfit();
        }return value;
    }


}

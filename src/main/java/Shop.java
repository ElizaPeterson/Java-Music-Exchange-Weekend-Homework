import instruments.Instrument;

import java.util.ArrayList;

public class Shop{

    private final String name;
    private final ArrayList<Instrument> stock;

    public Shop(String name){
        this.name = name;
        stock = new ArrayList<>();
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(Instrument instrument){
        this.stock.add(instrument);
    }

    public void removeStock(Instrument instrument){
        this.stock.remove(instrument);
    }

    public String getName() {
        return name;
    }
}

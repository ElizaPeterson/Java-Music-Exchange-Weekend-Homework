package instruments.percussion;

import behaviors.IPlay;
import behaviors.ISell;
import instruments.Instrument;

public class Drums extends Instrument implements IPlay, ISell {
    private double price;
    private final double cost;
    private final int size;

    public Drums(String color, String material, String brand, int size, double price, double cost) {
        super(color, material, brand);
        this.price = price;
        this.cost = cost;
        this.size = size;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public String play() {
        return "Bonk";
    }

    public int getSize() {
        return size;
    }

    public double calculateMarkup() {
        return ((this.price - this.cost)/this.cost)*100;
    }
}

package instruments.strings;

import behaviors.IPlay;
import behaviors.ISell;
import instruments.Instrument;

public class Guitar extends Instrument implements IPlay, ISell {
    private double price;
    private final double cost;
    private final int numberOfStrings;

    public Guitar(String color, String material, String brand, double price, double cost, int numberOfStrings) {
        super(color, material, brand);
        this.price = price;
        this.cost = cost;
        this.numberOfStrings = numberOfStrings;
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

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Wonderwall";
    }
    public double calculateMarkup() {
        return ((this.price - this.cost)/this.cost)*100;
    }
}

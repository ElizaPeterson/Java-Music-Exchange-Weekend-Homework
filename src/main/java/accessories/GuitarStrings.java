package accessories;

import behaviors.ISell;

public class GuitarStrings extends Accessories {

    private final String gauge;
    private double price;
    private final double cost;

    public GuitarStrings(String brand, String gauge, double price, double cost) {
        super(brand);
        this.gauge = gauge;
        this.price = price;
        this.cost = cost;
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

    public String getGauge() {
        return gauge;
    }

    public double calculateMarkup() {
        return ((this.price - this.cost)/this.cost)*100;
    }

}

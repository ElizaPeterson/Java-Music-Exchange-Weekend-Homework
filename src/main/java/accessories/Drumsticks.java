package accessories;

public class Drumsticks extends Accessories {

    private final int size;
    private double price;
    private final double cost;
    public Drumsticks(String brand, int size, double price, double cost){
        super(brand);
        this.size = size;
        this.price = price;
        this.cost = cost;
    }

    public int getSize() {
        return size;
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

    public double calculateMarkup() {
        return ((this.price - this.cost)/this.cost)*100;
    }
}

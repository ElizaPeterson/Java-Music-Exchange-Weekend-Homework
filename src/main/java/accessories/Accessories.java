package accessories;

import behaviors.ISell;

public abstract class Accessories implements ISell {
    private final String brand;

    public Accessories(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

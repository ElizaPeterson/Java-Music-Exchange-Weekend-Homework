package instruments;

import behaviors.IPlay;

public abstract class Instrument{

    private final String color;
    private final String material;
    private final String brand;

    public Instrument(String color, String material, String brand){
        this.color = color;
        this.material = material;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }
}

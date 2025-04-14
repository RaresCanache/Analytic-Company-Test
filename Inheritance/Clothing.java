package Inheritance;

public class Clothing extends Product {
    private int size;
    private String material;

    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price);
        this.size = size;
        this.material = material;
    }

    public String toString() {
        return super.toString() + " _ " + this.size + " _ " + this.material;
    }
}

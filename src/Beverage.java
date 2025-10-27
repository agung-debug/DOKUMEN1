// EXTRACT SUPERCLASS: Beverage menjadi induk untuk semua minuman
public abstract class Beverage {
    protected String name;
    protected double price;

    // Constructor
    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Encapsulate Field: Getter & Setter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract Method (akan diimplementasi di Coffee)
    public abstract void displayInfo();
}

package skinstrade.model;

public class Item {
    private String name;
    private double price;
    private double wear;

    public Item() {
        this.name = "";
        this.price = 0.0;
        this.wear = 1.0;
    }

    public Item(String name, double price, double wear) {
        this.name = name;
        this.price = price;
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(double wear) {
        this.wear = wear;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", wear=" + wear +
                '}';
    }
}

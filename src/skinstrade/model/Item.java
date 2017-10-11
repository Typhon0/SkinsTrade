package skinstrade.model;

import java.util.Comparator;

public class Item implements Comparable<Item>, Comparator<Item> {
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

    @Override
    public int compareTo(Item o) {
        if(this.name.equals(o.name)){
            if(this.wear == o.wear){
                return 0;
            }else if(this.wear > o.wear){
                return 1;
            }else{
                return -1;
            }
        }else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.compareTo(o2);
    }
}

package test.org;

public class Item {

    private String name;
    private double price;
    private int offer;
    private int quantity;

    Item(String s, double d, int i, int q)
    {
        setName(s);
        setPrice(d);
        setOffer(i);
        setQuantity(q);
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

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

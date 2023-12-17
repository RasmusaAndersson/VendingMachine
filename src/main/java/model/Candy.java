package model;

public class Candy extends Product {
    public Candy(int id, double price, String productName) {
        setId(id);
        setPrice(price);
        setProductName(productName);
    }

    @Override
    public String examine() {
        return "Candy: Snickers - Twix - Mars";
    }

    @Override
    public String use() {
        return "Candy.";
    }
}

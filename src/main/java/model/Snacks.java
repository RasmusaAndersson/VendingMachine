package model;

public class Snacks extends Product {
    public Snacks(int id, double price, String productName) {
        setId(id);
        setPrice(price);
        setProductName(productName);
    }

    @Override
    public String examine() {
        return " Snacks: Chips - PopCorn - Nuts";
    }

    @Override
    public String use() {
        return "Drink the soda.";
    }
}
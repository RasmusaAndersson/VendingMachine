package model;

public class Soda extends Product {
    public Soda(int id, double price, String productName) {
        setId(id);
        setPrice(price);
        setProductName(productName);
    }

    @Override
    public String examine() {
        return " Soda: Coca-Cola - Fanta - Sprite";
    }

    @Override
    public String use() {
        return "1  -  2  -  3";
    }
}

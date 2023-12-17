package vending_machine;

import model.Product;

public class VendingMachineImpl implements IVendingMachine {
    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }



    @Override
    public void addCurrency(double amount) {
        if (amount == 1 || amount == 5 || amount == 10 || amount == 20 || amount == 50) {
            depositPool += amount;
        }
    }


    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public int request(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                if (depositPool >= products[i].getPrice()) {
                    depositPool -= products[i].getPrice();
                    return i;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }

    @Override
    public int endSession() {
        int balance = depositPool;
        depositPool = 0;
        return balance;
    }

    @Override
    public String getDescription(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                return products[i].getProductName();
            }
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        String[] productNames = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productNames[i] = products[i].getProductName();
        }
        return productNames;
    }
}

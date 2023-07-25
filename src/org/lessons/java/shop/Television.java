package org.lessons.java.shop;

public class Television extends Prodotto{

    private String dimension;
    private boolean smart;
    public Television(String name, String brand, Double price, Double iva, String dimension, boolean smart) {
        super(name, brand, price, iva);
        this.dimension= dimension;
        this.smart= smart;
    }

    @Override
    public String toString() {
        return " name:"+getName()+" brand:"+getBrand()+" price:"+taxedPrice()+" Dimension:"+dimension+" smart tv"+smart;

    }
}

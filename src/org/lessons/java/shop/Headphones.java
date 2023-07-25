package org.lessons.java.shop;

public class Headphones extends Prodotto{

    private String colour;
    private boolean wireless;
    public Headphones(String name, String brand, Double price, Double iva, String colour, boolean wireless) {
        super(name, brand, price, iva);
        this.colour=colour;
        this.wireless=wireless;
    }

    @Override
    public String toString() {
        return " name:"+getName()+" brand:"+getBrand()+" price:"+taxedPrice()+" colour:"+colour+" wireless:"+wireless;

    }
}

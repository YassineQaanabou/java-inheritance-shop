package org.lessons.java.shop;

public class Headphones extends Prodotto{

    private String colour;
    private String wireless;
    public Headphones(String name, String brand, Double price, Double iva, String fidelity, String colour, String wireless) {
        super(name, brand, price, iva, fidelity);
        this.colour=colour;
        this.wireless=wireless;
    }

    public double finalPrice(){
        if (getFidelity().equalsIgnoreCase("si") && wireless.equalsIgnoreCase("no")){
            return discountedPrice()-(taxedPrice()*0.07);
        } else {
            return taxedPrice();
        }
    }
    @Override
    public String toString() {
        return "Product {name:"+getName()+" brand:"+getBrand()+" price:"+finalPrice()+"$" + " colour:"+colour+" wireless:"+wireless+"}";

    }
}

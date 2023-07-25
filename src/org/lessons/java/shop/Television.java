package org.lessons.java.shop;

public class Television extends Prodotto{

    private String dimension;
    private String smart;
    public Television(String name, String brand, Double price, Double iva,String fidelity,  String dimension, String smart) {
        super(name, brand, price, iva,fidelity);
        this.dimension= dimension;
        this.smart= smart;
    }

    public double finalPrice(){
        if (getFidelity().equalsIgnoreCase("si") && smart.equalsIgnoreCase("no")){
            return discountedPrice()-(taxedPrice()*0.10);
        } else {
            return taxedPrice();
        }
    }

    @Override
    public String toString() {
        return "Product{ name:"+getName()+" brand:"+getBrand()+" price:"+finalPrice()+" Dimension:"+dimension+" smart tv"+smart+"}";

    }
}

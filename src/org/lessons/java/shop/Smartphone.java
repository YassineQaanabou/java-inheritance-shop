package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    private int imeiCode;
    private int memorySpace;
    public Smartphone(String name, String brand, Double price, Double iva, int imeiCode, int memorySpace ) {
        super(name, brand, price, iva);
        this.imeiCode=imeiCode;
        this.memorySpace=memorySpace;
    }

    @Override
    public String toString() {
        return " name:"+getName()+" brand:"+getBrand()+" price:"+taxedPrice()+" IMEI:"+imeiCode+" memory space"+memorySpace;
    }
}

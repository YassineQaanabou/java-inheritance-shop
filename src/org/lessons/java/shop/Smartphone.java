package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    private int imeiCode;
    private int memorySpace;
    public Smartphone(String name, String brand, Double price, Double iva, String fidelity, int imeiCode, int memorySpace ) {
        super(name, brand, price, iva, fidelity);
        this.imeiCode=imeiCode;
        this.memorySpace=memorySpace;
    }

   public double finalPrice(){
       if (getFidelity().equalsIgnoreCase("si") && memorySpace<32){
           return discountedPrice()-(taxedPrice()*0.05);
       } else {
           return taxedPrice();
       }
   }

    @Override
    public String toString() {
        return " Product {name:"+getName()+" brand:"+getBrand()+" price:"+finalPrice()+" IMEI:"+imeiCode+" memory space"+memorySpace+"}";
    }
}

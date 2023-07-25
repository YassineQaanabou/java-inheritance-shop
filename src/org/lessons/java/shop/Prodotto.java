package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private double price;
    private double iva;
    private String fidelity;

    public Prodotto(String name, String brand, Double price, Double iva, String fidelity) {
        Random randomGenerator = new Random();


        this.code = randomGenerator.nextInt(1, 99999999);
        this.name = name;
        this.price = price;
        this.iva = iva;
        this.brand = brand;
        this.fidelity = fidelity;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getFidelity() {
        return fidelity;
    }

    public double taxedPrice() {

        double taxedPrice = price + (price * (iva / 100));

        return taxedPrice;

    }

    public double discountedPrice() {

        double taxedPrice = price + (price * (iva / 100));

        if (fidelity.equalsIgnoreCase("si")) {
            double discountedPrice = taxedPrice - (taxedPrice * 0.02);
            return discountedPrice;

        } else {
            return  taxedPrice;
        }
        }
    }


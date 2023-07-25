package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Nome prodotto:");
        String name= scan.nextLine();

        System.out.println("Marca prodotto:");
        String brand= scan.nextLine();

        System.out.println("Prezzo prodotto:");
        double price= scan.nextDouble();

        System.out.println("Iva prodotto:");
        double iva= scan.nextDouble();

        System.out.println("Indica tipo prodotto:");
        String type= scan.nextLine();

        if (type.equals("Smartphone")) {
            System.out.println("Smartphone IMEI:");
            int imeiCode = scan.nextInt();

            System.out.println("Smartphone memory:");
            int memorySpace = scan.nextInt();

            Smartphone smartphone = new Smartphone(name, brand, price, iva, imeiCode, memorySpace);
            System.out.println(smartphone);

        } else if (type.equals("Television")) {

            System.out.println("Dimensioni televisore:");
            String dimension = scan.nextLine();
            System.out.println("Smart TV:");
            boolean smart = scan.nextBoolean();

            Television television = new Television(name, brand, price, iva, dimension, smart);
            System.out.println(television);

        } else if (type.equals("Headphones")) {

                System.out.println("Colore cuffiette:");
                String colour = scan.nextLine();
                System.out.println("Wireless:");
                boolean wireless = scan.nextBoolean();

                Headphones headphones = new Headphones(name, brand, price, iva, colour, wireless);
                System.out.println(headphones);
        }


                scan.close();
        }
    }


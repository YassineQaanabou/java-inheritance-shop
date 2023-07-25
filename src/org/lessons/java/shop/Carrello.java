package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Prodotto> cart = new ArrayList<>();

        boolean flag=false;

        while (!flag) {

            System.out.println("Vuoi aggiungere un prodotto al carrello?");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("si")) {

                System.out.println("Nome prodotto:");
                String name = scan.nextLine();

                System.out.println("Marca prodotto:");
                String brand = scan.nextLine();

                System.out.println("Prezzo prodotto:");
                double price = Double.parseDouble(scan.nextLine());

                System.out.println("Iva prodotto:");
                double iva = Double.parseDouble(scan.nextLine());

                System.out.println("Indica tipo prodotto:");
                String type = scan.nextLine();

                if (type.equalsIgnoreCase("Smartphone")) {
                    System.out.println("Smartphone IMEI:");
                    int imeiCode = scan.nextInt();

                    System.out.println("Smartphone memory:");
                    int memorySpace = scan.nextInt();

                    Prodotto smartphone = new Smartphone(name, brand, price, iva, imeiCode, memorySpace);

                    cart.add(smartphone);

                } else if (type.equalsIgnoreCase("televisore")) {

                    System.out.println("Dimensioni televisore:");
                    String dimension = scan.nextLine();
                    System.out.println("Smart TV:");
                    String smart = scan.nextLine();

                    Prodotto television = new Television(name, brand, price, iva, dimension, smart);

                    cart.add(television);


                } else if (type.equalsIgnoreCase("cuffiette")) {

                    System.out.println("Colore cuffiette:");
                    String colour = scan.nextLine();
                    System.out.println("Wireless:");
                    String wireless = scan.nextLine();

                    Prodotto headphones = new Headphones(name, brand, price, iva, colour, wireless);
                    cart.add(headphones);

                } else {
                    System.out.println("Tipo prodotto non riconosciuto");
                }
            } else if (choice.equalsIgnoreCase("no")) {
                flag=true;
            }


        }

        for (Prodotto prodotto : cart) {
            System.out.print(prodotto);
        }

        System.out.println("Grazie per aver fatto acquisti da noi");

            scan.close();
        }
    }


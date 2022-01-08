package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantity = sc.nextInt();
        clearBuffer(sc);

        Product[] product = new Product[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Qual o nome do produto? ");
            String name = sc.nextLine();

            System.out.print("Qual o preço do produto? ");
            double price = sc.nextDouble();
            clearBuffer(sc);

            product[i] = new Product(name, price);

        }

        double total = 0.0;

        for (int i = 0; i<quantity;i++ ) {
            total = total + product[i].Price;
        }

        System.out.println("Média: " + String.format("%.2f",total));



        sc.close();

    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}



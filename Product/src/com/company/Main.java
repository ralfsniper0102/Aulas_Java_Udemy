package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String name = sc.next();
        clearBuffer(sc);

        System.out.print("digite o preço do produto: ");
        double price = sc.nextDouble();
        clearBuffer(sc);

        Product x = new Product(name, price);

        System.out.println(x.getName());
        System.out.println(x.getPrice());

        sc.close();

    }


    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

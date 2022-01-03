package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do programa: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        //clearBuffer(sc);

        System.out.print("Preço: ");
        double price = sc.nextDouble();
        //clearBuffer(sc);

        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();

        //clearBuffer(sc);

        Product x = new Product(name, price, quantity);

        System.out.println("Dados do produto: " + x);

        //System.out.print("Entre com um número para adicionar no estoque: ");



        System.out.println("Dados atualizados do produto: " + x);
        //clearBuffer(sc);


        sc.close();

    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

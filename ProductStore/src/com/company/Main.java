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
        

        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();

        Product x = new Product(name, price, quantity);

        System.out.println("Dados do produto: " + x.ToString());

        System.out.print("Entre com um número para adicionar no estoque: ");

        x.addQuantity(sc.nextInt());


        System.out.println("Dados atualizados do produto: " + x.ToString());

        int v1 = 0;
        do {

            System.out.print("Entre com um número para remover no estoque: ");

            v1 = sc.nextInt();


            if (v1 > x.Quantity) {
                System.out.println("Quantidade em estoque menor que a necessário para ser retirada");
            }
        } while (v1 > x.Quantity);
        x.removeQuantity(v1);

        sc.close();

        System.out.println("Dados atualizados do produto: " + x.ToString());


    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

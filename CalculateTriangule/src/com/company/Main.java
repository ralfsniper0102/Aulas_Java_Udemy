package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro lado do triangulo: ");
        Calculator.Side1 = sc.nextDouble();
        clearBuffer(sc);

        System.out.print("Digite o segundo lado do triangulo: ");
        Calculator.Side2 = sc.nextDouble();
        clearBuffer(sc);

        System.out.print("Digite o terceiro lado do triangulo: ");
        Calculator.Side3 = sc.nextDouble();
        clearBuffer(sc);


        sc.close();

        System.out.println(Calculator.Perimeter());
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }


}

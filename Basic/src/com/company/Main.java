package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Ola");

        double a = 14.6767;
        System.out.printf("%.2f", a);

        double b = 8686.656, c = 5656.87987, d = 454.787;

        System.out.printf("%.2f , %.2f, %.2f", b, c, d);

        System.out.println("");


        String name = "Rafael";
        int year = 30;
        double height = 1.88;

        System.out.printf("Nome: %s, Idade: %d, altura: %.2f", name, year, height);



    }
}

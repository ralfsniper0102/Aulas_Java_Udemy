package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Quantos quartos deseja reservar?: ");
        int quantity = sc.nextInt();



        sc.close();


    }
}

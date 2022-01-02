package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite uma frase: ");
        Scanner sc = new Scanner(System.in);

        String phrase = sc.nextLine();

        String[] a = phrase.split(" ");

        for (String obj: a ) {
            System.out.println(obj);
        }
        sc.close();

    }
}

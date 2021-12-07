package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Reserva[] v = new Reserva[10];

        System.out.print("Quantos quartos você reservará? ");
        int reservas = sc.nextInt();

        clearBuffer(sc);
        for (int i = 0; i<reservas; i++){
            System.out.println("Reserva #" + (i+1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            if(quarto == 10) {
                quarto = 0;
            }
            v[quarto] = new Reserva(nome, email, quarto);
            System.out.println("");
            clearBuffer(sc);
        }

        System.out.println("Quarto Reservados: ");

        for(int i = 1; i<10; i++) {
            if(v[i]!=null){
                System.out.println(i + ": "
                        + v[i].getNome()
                        + ", " + v[i].getEmail());
            }
        }
        sc.close();

        for (Reserva obj : v){
            System.out.println(obj.getNome()); //////////impressão do valore da classe dentor do vetor

        }
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }



}

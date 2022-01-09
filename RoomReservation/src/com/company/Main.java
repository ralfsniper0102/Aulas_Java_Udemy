package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos deseja reservar?: ");
        int quantity = sc.nextInt();
        clearBuffer(sc);

        Reservation[] reservations = new Reservation[11];

        for(int i = 0; i < quantity; i++){
            System.out.println("Reserva #" + (i+1));
            System.out.print("Nome: ");

            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            clearBuffer(sc);

            reservations[room] = new Reservation(nome, email, room);

        }

        System.out.println("Quartos reservados: ");

        for (Reservation obj : reservations) {
            if(obj != null){
                System.out.println(obj.Room
                        + ": "
                        + obj.Name
                        + ", "
                        + obj.Email
                        );
            }
        }
        System.out.println();
        sc.close();


    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

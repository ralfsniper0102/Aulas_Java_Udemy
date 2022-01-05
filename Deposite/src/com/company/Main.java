package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número da conta: ");
        int acc = sc.nextInt();
        clearBuffer(sc);

        System.out.print("Entre com o nome do titular da conta: ");
        String name = sc.nextLine();

        System.out.print("Deseja efetuar um deposito inicial (s/n)? ");
        char YesorNo = sc.next().charAt(0);

        double deposite = 0.0;


        if (Character.toLowerCase(YesorNo) == 's') {
            System.out.print("Entre com um valor para deposito inicial: ");
            deposite = sc.nextDouble();


        }

        Holder x = new Holder(acc, name, deposite);

        System.out.println("Dados da conta:");
        System.out.println(x.ToString());

        System.out.print("Entre com um valor de deposito: ");
        x.DepositMoney(sc.nextDouble());

        System.out.println("Dados da conta:");
        System.out.println(x.ToString());

        System.out.println("Entre com o valor de saque de dinheiro");
        x.WithdrawMoney(sc.nextDouble());

        System.out.println("Dados da conta:");
        System.out.println(x.ToString());


    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

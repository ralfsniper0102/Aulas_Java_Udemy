package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios deseja cadastrar? ");
        int quantity = sc.nextInt();

        ArrayList<Employee> employes = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Empregado #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            employes.add(new Employee(id, name, salary));
        }

        System.out.print("Entre como o id do empregado para dar aumento de salario: ");
        double increase = sc.nextDouble();

        if(increase == employes.stream().filter(x -> x )){

        }


        sc.close();
    }
}

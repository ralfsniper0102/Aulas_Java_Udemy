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
        int key;
        for (int i = 0; i < quantity; i++) {
            key = 0;
            System.out.println("Empregado #" + (i + 1));
            int id;

            do {

                System.out.print("Id: ");
                id = sc.nextInt();
                int finalId = id;
                Employee result = employes.stream().filter(x -> x.Id == finalId).findFirst().orElse(null);
                if (result == null) {
                    key = 1;
                } else {
                    System.out.println("Id já cadastrado");
                }
            } while (key == 0);

            clearBuffer(sc);

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            employes.add(new Employee(id, name, salary));
        }

        key = 0;
        do {
            System.out.print("Entre como o id do empregado para dar aumento de salario: ");
            int increase = sc.nextInt();

            Employee result = employes.stream().filter(x -> x.Id == increase).findFirst().orElse(null);

            if (result != null) {
                System.out.print("entre com o valor em porcentagem: ");
                result.Increase(sc.nextDouble());
                key = 1;
            } else {
                System.out.println("id não percebe a nenhum funcionário");
            }

        } while (key == 0);
        sc.close();

        System.out.println("Lista de Empregados:");
        for (Employee obj : employes) {
            System.out.println(obj.Id
                    + ", "
                    + obj.Name
                    + ", "
                    + obj.Salary
            );
        }

    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Funcionario> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você quer registrar?");

        int funcionarios = sc.nextInt();



        for (int i=0; i < funcionarios;i ++){
            System.out.println("Empregado #" + (i+1));
            System.out.print("Id: ");
            int idFuncionario = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            double salario = sc.nextDouble();

            lista.add(new Funcionario(idFuncionario,nome, salario));
        }

        int n1 = 0;

        do {
            System.out.println("Qual o ID que receberá aumento? ");
            int identificador = sc.nextInt();
            if (lista.){

            }
        }while (n1 == 0);

    }
}

package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] v = new Produto[n]; ///// instaciação do produto em um vetor no Main

        for(int i = 0; i < n; i++ ){
            String nome = sc.next();
            double preco = sc.nextDouble();
            v[i] = new Produto(nome, preco); /////// inserção dos valores em uma posição do vetor
        }

        double soma = 0.0;

        for (int i = 0;i < n; i++){
            soma = soma + v[i].getPreco();

        }

        soma = (soma/n);
        System.out.println("Média: " + String.format("%.2f",soma));

        sc.close();

    }
}

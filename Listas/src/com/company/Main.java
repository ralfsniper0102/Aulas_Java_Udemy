package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();


        lista.add("ola");/////adicionar
        lista.add("lohbo");
        lista.add("trola");
        lista.add("la");
        lista.add("la");
        lista.add("la");
        lista.add("la");
        lista.add("la");
        lista.add("la");
        lista.add("la");
        lista.add("la");
        lista.remove(0);//////remover
        lista.removeIf(x -> x.charAt(0) =='o'); /// remover, x tal que x.charAt(0) for igual a o  - predicado
        lista.add("guguii");
        System.out.println(lista);

        System.out.println(lista.indexOf("la")); /////procura a casa respectiva


        for (String obj : lista ){ ////foreach
            System.out.println(obj);
        }

        System.out.println("---------------------------------------");

        List<String> result = lista.stream().filter(x->x.charAt(0)=='l').collect(Collectors.toList()); // filtrar lista

        for (String obj : result) {
            System.out.println(obj);
        }

        System.out.println("----------------------------------------");
        String name = lista.stream().filter(x->x.charAt(0)=='i').findFirst().orElse(null); //////// acha o primeiro, se não achar retorna null

        System.out.println(name);

        System.out.println("----------------------------------------");

        /*
        System.out.println("quantidade: ");
        int quantidade = sc.nextInt();


        clearBuffer(sc);
        for (int i = 0; i < quantidade; i++) {
            System.out.println("nome: ");
            String nome = sc.nextLine();


            System.out.println("idade: ");
            int idade = sc.nextInt();


            lista.set(i, new ComplementoLista(nome, idade));

        }

        for (ComplementoLista obj:lista){
            System.out.print(obj.Nome + ", " + obj.Idade);
        }

        sc.close();*/

    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}

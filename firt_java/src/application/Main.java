package application;
import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto x = new Produto();

        System.out.println("Entre com as informações do produto:");

        System.out.print("Nome: ");
        x.Nome = sc.next();

        System.out.print("Preço: ");
        x.Preco = sc.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        x.Quantidade = sc.nextInt();

        System.out.println("Dados " + x.ToString());


        System.out.print("Entre com um valor para adicionar ao estoque: ");
        x.AdicionarQuantidade(sc.nextInt());

        System.out.println("Dados Atualizados " + x.ToString() );

        System.out.print("Entre com um valor para remover ao estoque: ");
        x.RemoverQuantidade(sc.nextInt());

        System.out.println("Dados Atualizados  " + x.ToString());





        sc.close();
    }
}


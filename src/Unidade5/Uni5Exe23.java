package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Nome do vendedor: ");
            String nome = sc.next();

            System.out.print("Número de produtos vendidos: ");
            int n = sc.nextInt();

            double totalVendas = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Preço unitário do produto: ");
                double preco = sc.nextDouble();

                System.out.print("Quantidade vendida deste produto: ");
                int quantidade = sc.nextInt();

                totalVendas += preco * quantidade;
            }

            double salario = totalVendas * 0.30;

            System.out.println(" Relatório do Vendedor ");
            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salário: R$ %.2f%n", salario);
            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = sc.next().charAt(0);
        }

    }
}
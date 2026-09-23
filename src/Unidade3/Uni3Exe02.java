package Unidade3;

import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco;
        double desconto;
        double precoComDesconto;

        System.out.print("Digite o preço do par de sapatos: ");
        preco = sc.nextDouble();

        desconto = preco * 0.12;
        precoComDesconto = preco - desconto;

        System.out.printf("O valor do desconto é de R$%.2f%n", desconto);
        System.out.printf("O preço do par de sapatos com desconto é R$%.2f%n", precoComDesconto);

    }
}
package Unidade3;

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoLitro;
        double valorPagamento;
        double litros;

        System.out.print("Preço do litro de gasolina: ");
        precoLitro = sc.nextDouble();

        System.out.print("Valor do pagamento: ");
        valorPagamento = sc.nextDouble();

        litros = valorPagamento / precoLitro;

        System.out.printf("O motorista conseguiu colocar: %.2f litros.%n", litros);

    }
}
package Unidade3;

import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float valorDolar;
        float cotacao;
        float valorReais;

        System.out.println("Valor em dólares recebido pelo cliente: ");
        valorDolar = sc.nextFloat();

        System.out.println("Cotação do dólar hoje: ");
        cotacao = sc.nextFloat();

        valorReais = valorDolar * cotacao;

        System.out.printf("O atendente deve devolver R$%.2f para o cliente.%n", valorReais);

        sc.close();
    }
}

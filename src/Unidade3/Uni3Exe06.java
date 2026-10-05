package Unidade3;

import java.util.Scanner;

public class Uni3Exe06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float pesoTotal;
        float pesoPrato = 0.750f;
        float pesoComida;
        float valor;

        pesoTotal = sc.nextFloat();

        pesoComida = pesoTotal - pesoPrato;
        valor = pesoComida * 25;

        System.out.printf("O valor do prato do cliente é R$%.2f%n", valor);

        sc.close();
    }
}
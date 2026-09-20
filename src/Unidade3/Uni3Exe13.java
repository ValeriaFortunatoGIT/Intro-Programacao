package Unidade3;

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double comprimento;
        double area;
        double quantidadeAzulejos;
        double valor;

        System.out.print("Altura: ");
        altura = sc.nextDouble();

        System.out.print("Comprimento: ");
        comprimento = sc.nextDouble();

        area = altura * comprimento;
        quantidadeAzulejos = area * 9;
        valor = quantidadeAzulejos * 12.50;

        System.out.printf("O valor final é R$%.2f%n", valor);

    }
}
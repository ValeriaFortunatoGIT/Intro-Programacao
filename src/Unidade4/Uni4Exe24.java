package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {

        int valor1, valor2, valor3, opcao, aux;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Valor 2: ");
        valor2 = sc.nextInt();

        System.out.print("Valor 3: ");
        valor3 = sc.nextInt();

        System.out.print("Opção: ");
        opcao = sc.nextInt();


        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        if (valor2 > valor3) {
            aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }
        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        if (opcao == 1) {
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        } else if (opcao == 2) {
            System.out.println(valor3 + " " + valor2 + " " + valor1);
        } else if (opcao == 3) {
            System.out.println(valor2 + " " + valor3 + " " + valor1);
        } else {
            System.out.println("Opção inválida");
        }

    }
}
package Unidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {

        double valor1, valor2, resultado;
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor 1: ");
        valor1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        valor2 = sc.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        System.out.print("Opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = valor1 + valor2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println(resultado);
                break;
            case 4:
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.println(resultado);
                } else {
                    System.out.println("Erro: O denominador não pode ser zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }
}
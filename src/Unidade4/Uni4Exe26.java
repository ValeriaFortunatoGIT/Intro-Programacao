package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        char opcao;
        double base, altura, lado, raio, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T : calcular a área de um triângulo de base b e altura h");
        System.out.println("Q : calcular a área de um quadrado de lado l");
        System.out.println("R : calcular a área de um retângulo de base b e altura h");
        System.out.println("C : calcular a área de um círculo de raio r");
        
        opcao = sc.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.print("Digite a base e a altura do triangulo: ");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                area = (base * altura) / 2.0;
                System.out.println("Área do triângulo = " + area);
                break;

            case 'Q':
                System.out.print("Digite o lado: ");
                lado = sc.nextDouble();
                area = lado * lado;
                System.out.println("Área do quadrado = " + area);
                break;

            case 'R':
                System.out.print("Digite a base e a altura do retangulo: ");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                area = base * altura;
                System.out.println("Área do retângulo = " + area);
                break;

            case 'C':
                System.out.print("Digite o raio: ");
                raio = sc.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo = " + area);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
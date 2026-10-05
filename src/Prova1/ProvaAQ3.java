package Prova1;

import java.util.Scanner;

public class ProvaAQ3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char opcao;
    double area, lado, base, altura, raio;

    System.out.println("Q - Quadrado");
    System.out.println("R - Retangulo");
    System.out.println("C - Circulo");
    System.out.println("T - Triangulo");
    System.out.println("Escola uma figura: ");

    opcao = sc.next().toUpperCase().charAt(0);

    switch (opcao) {

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

            case 'T':
                System.out.print("Digite a base e a altura do triangulo: ");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                area = (base * altura) / 2.0;
                System.out.println("Área do triângulo = " + area);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
}
}

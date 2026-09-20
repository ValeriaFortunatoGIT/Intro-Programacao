package Unidade3;

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;

        System.out.printf("Media ponderada: %.2f%n", media);

    }
}
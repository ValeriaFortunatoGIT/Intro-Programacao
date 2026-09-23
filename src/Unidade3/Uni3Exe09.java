package Unidade3;

import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;
        double altura;
        double volume;

        System.out.print("Raio: ");
        raio = sc.nextDouble();

        System.out.print("Altura: ");
        altura = sc.nextDouble();

        volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de óleo é: %.2f%n", volume);

    }
}
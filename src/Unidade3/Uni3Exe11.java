package Unidade3;

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Temperatura em °C: ");
        celsius = sc.nextDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.printf("Temperatura em °F: %.2f%n", fahrenheit);

    }
}
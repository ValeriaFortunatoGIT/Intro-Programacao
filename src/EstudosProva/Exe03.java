package EstudosProva;

import java.util.Scanner;

public class Exe03 {
public static void main(String[] args) {

    double valorDePi;
    Scanner sc = new Scanner(System.in);
    double raio, circunferencia;
    valorDePi = 3.14159;

    System.out.println("Digite o raio: ");
    raio = sc.nextDouble();

    circunferencia = Math.pow(raio, 2) * valorDePi;
    // Math.pow(raio, 2) = eleva o valor de "raio" ao quadrado.
    // Depois multiplica o resultado pelo valor de Pi.
    // Ou seja: raio² × Pi.

    System.out.println("A circunferencia é: " + circunferencia);
}
}

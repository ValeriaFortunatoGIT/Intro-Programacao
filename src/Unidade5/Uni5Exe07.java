package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe07 {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt();

    if (n > 0) {
        double numero = teclado.nextDouble();

        double maior = numero;
        double menor = numero;

        for (int i = 2; i <= n; i++) {
            numero = teclado.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.printf("Maior número: %.2f%n", maior);
        System.out.printf("Menor número: %.2f%n", menor);
    }

}
}
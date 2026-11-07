package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        double totalQuilometragem = 0;
        double totalCombustivel = 0;

        for (int i = 1; i <= n; i++) {
            double km = teclado.nextDouble();
            double litros = teclado.nextDouble();

            double kmPorLitro = km / litros;
            System.out.printf("Parada %d: %.1f km por litro%n", i, kmPorLitro);

            totalQuilometragem += km;
            totalCombustivel += litros;
        }

        double mediaTotal = totalQuilometragem / totalCombustivel;
        System.out.printf("Quilometragem média obtida por litro: %.2f%n", mediaTotal);

    }
}
package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int menorNegativo = 0;
        boolean temNegativo = false;
        int somaPositivos = 0;
        int qtdPositivos = 0;

        for (int i = 0; i < n; i++) {
            int numero = teclado.nextInt();

            if (numero < 0) {
                if (!temNegativo || numero < menorNegativo) {
                    menorNegativo = numero;
                    temNegativo = true;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                qtdPositivos++;
            }
        }

        if (temNegativo) {
            System.out.println("Menor valor negativo: " + menorNegativo);
        }

        if (qtdPositivos > 0) {
            double media = (double) somaPositivos / qtdPositivos;
            System.out.printf("Média dos números positivos: %.2f%n", media);
        }

    }
}
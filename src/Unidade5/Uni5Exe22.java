package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = 2000.0;
        double percentualAumento = 1.5;

        for (int ano = 1996; ano <= 2026; ano++) {
            salario += salario * (percentualAumento / 100);
            percentualAumento *= 2;
        }

        System.out.printf("Salário atual: %.2f%n", salario);

    }
}
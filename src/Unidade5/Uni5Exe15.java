package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.next();

        while (!nome.equalsIgnoreCase("fim")) {
            double nota1 = teclado.nextDouble();
            double nota2 = teclado.nextDouble();

            double media = (nota1 + nota2) / 2.0;

            System.out.printf("A média do(a) %s é %.1f%n", nome, media);

            nome = teclado.next();
        }

    }
}
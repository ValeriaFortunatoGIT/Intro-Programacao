package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int canal = sc.nextInt();

        int pessoasCanal4 = 0;
        int pessoasCanal5 = 0;
        int pessoasCanal9 = 0;
        int pessoasCanal12 = 0;
        int totalPessoas = 0;

        while (canal != 0) {
            int pessoas = sc.nextInt();

            if (canal == 4) {
                pessoasCanal4 += pessoas;
            } else if (canal == 5) {
                pessoasCanal5 += pessoas;
            } else if (canal == 9) {
                pessoasCanal9 += pessoas;
            } else if (canal == 12) {
                pessoasCanal12 += pessoas;
            }

            totalPessoas += pessoas;

            canal = sc.nextInt();
        }

        if (totalPessoas > 0) {
            double percentual4 = (double) pessoasCanal4 / totalPessoas * 100;
            double percentual5 = (double) pessoasCanal5 / totalPessoas * 100;
            double percentual9 = (double) pessoasCanal9 / totalPessoas * 100;
            double percentual12 = (double) pessoasCanal12 / totalPessoas * 100;

            System.out.printf("Percentual de audiência do canal 4: %.0f%%%n", percentual4);
            System.out.printf("Percentual de audiência do canal 5: %.0f%%%n", percentual5);
            System.out.printf("Percentual de audiência do canal 9: %.0f%%%n", percentual9);
            System.out.printf("Percentual de audiência do canal 12: %.0f%%%n", percentual12);
        }

    }
}
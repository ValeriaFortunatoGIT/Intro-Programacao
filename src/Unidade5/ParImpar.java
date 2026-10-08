package Unidade5;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---É ÍMPAR OU PAR?---");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }
        }

        System.out.println("---SOMENTE PAR---");
        for (int i = 100; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Mas tem sempre que começar de um número par
        System.out.println("---OU---");
        for (int i = 100; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }
}

/*
 * Uni5Exe29.java - Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. 
 * Leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor solicitado.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor desejado para saque: ");
        int valor = sc.nextInt();

        // Variáveis para guardar a quantidade de cada cédula
        int cedulas20 = 0;
        int cedulas10 = 0;
        int cedulas5 = 0;
        int cedulas2 = 0;
        int cedulas1 = 0;

        int resto = valor;

        // Calcula a quantidade de cédulas de 20
        if (resto >= 20) {
            cedulas20 = resto / 20;
            resto = resto % 20; // Guarda o que sobrou
        }

        // Calcula a quantidade de cédulas de 10
        if (resto >= 10) {
            cedulas10 = resto / 10;
            resto = resto % 10;
        }

        // Calcula a quantidade de cédulas de 5
        if (resto >= 5) {
            cedulas5 = resto / 5;
            resto = resto % 5;
        }

        // Calcula a quantidade de cédulas de 2
        if (resto >= 2) {
            cedulas2 = resto / 2;
            resto = resto % 2;
        }

        // O que sobrou é a quantidade de cédulas de 1
        if (resto >= 1) {
            cedulas1 = resto / 1;
            resto = 0;
        }

        // Exibe o resultado detalhado da quantidade mínima de cédulas
        System.out.println("\n--- QUANTIDADE MÍNIMA DE CÉDULAS PARA R$ " + valor + " ---");
        System.out.println("Cédulas de R$ 20: " + cedulas20);
        System.out.println("Cédulas de R$ 10: " + cedulas10);
        System.out.println("Cédulas de R$ 5:  " + cedulas5);
        System.out.println("Cédulas de R$ 2:  " + cedulas2);
        System.out.println("Cédulas de R$ 1:  " + cedulas1);

        sc.close();
    }
}
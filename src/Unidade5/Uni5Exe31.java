/*
 * Uni5Exe31.java - Dado um número inteiro positivo, determine a sua decomposição em fatores primos. 
 * A saída do programa deve exibir o número e o fator primo correspondente a cada passo, 
 * imitando a estrutura de uma tabela de fatoração.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo para decomposição: ");
        int numero = sc.nextInt();

        // Valida se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo maior que zero.");
        } else {
            System.out.println("\n--- TABELA DE DECOMPOSIÇÃO EM FATORES PRIMOS ---");
            System.out.printf("%-10s | %-10s\n", "número", "decomposição");
            System.out.println("-------------------------");

            int divisor = 2; // O menor número primo para iniciar a divisão

            // O laço roda enquanto o número for maior que 1
            while (numero > 1) {
                // Se o número for divisível pelo divisor atual
                if (numero % divisor == 0) {
                    System.out.printf("%-10d | %-10d\n", numero, divisor);
                    numero = numero / divisor; // Atualiza o número dividindo-o pelo fator primo
                } else {
                    // Se não for divisível, incrementa o divisor para testar o próximo número
                    divisor++;
                }
            }

            // Exibe a última linha indicando que chegou a 1
            System.out.printf("%-10d | %-10s\n", 1, "");
        }

        sc.close();
    }
}
/*
 * Uni5Exe32.java - Escreva um programa que imprime um calendário para um determinado mês. 
 * O calendário deve conter cada dia do mês e o dia da semana correspondente. 
 * A entrada consiste de:
 * - p: um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado).
 * - n: um inteiro especificando o número de dias que o mês possui.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o dia da semana em que o mês começa (1=Domingo até 7=Sábado)
        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int p = sc.nextInt();

        // Lê o total de dias que o mês possui
        System.out.print("Informe o número de dias que o mês possui (ex: 28, 30, 31): ");
        int n = sc.nextInt();

        // Imprime o cabeçalho do calendário (D S T Q Q S S)
        System.out.println("\n  D   S   T   Q   Q   S   S ");
        System.out.println("----------------------------");

        // Variável para controlar a posição atual na linha (de 1 a 7)
        int diaSemanaAtual = 1;

        // Imprime espaços em branco até chegar ao dia da semana em que o mês começa (p)
        // Como 'p' começa em 1 (Domingo), se p=3 (Terça), imprimimos espaços para Domingo (1) e Segunda (2)
        while (diaSemanaAtual < p) {
            System.out.print("    "); // 4 espaços para alinhar com os números
            diaSemanaAtual++;
        }

        // Loop para imprimir cada dia do mês de 1 até n
        for (int dia = 1; dia <= n; dia++) {
            // Imprime o dia formatado com largura fixa de 3 caracteres
            System.out.printf("%3d ", dia);

            // Se chegou ao sábado (diaSemanaAtual == 7), quebra a linha e reinicia a contagem da semana para 1
            if (diaSemanaAtual == 7) {
                System.out.println();
                diaSemanaAtual = 1;
            } else {
                diaSemanaAtual++;
            }
        }

        // Quebra final de linha para fechar o calendário bonitinho
        System.out.println("\n----------------------------");

        sc.close();
    }
}

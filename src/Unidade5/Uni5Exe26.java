/*
 * Uni5Exe26.java - Astolfo resolveu fazer uma viagem dividida em vários trechos. 
 * Leia inicialmente o valor máximo do pedágio que Astolfo se nega a pagar. 
 * Em seguida, leia várias duplas de valores (custo do pedágio e distância em Km). 
 * Calcule e escreva:
 * - quantos trechos possuem pedágio acima do valor que ele nega a pagar;
 * - quantos trechos foram informados;
 * - quantos trechos acima de 150Km possuem pedágio que ele concorda em pagar.
 * OBS: O programa encerra ao ser fornecido um valor de pedágio negativo (e a distância não deve ser lida).
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o valor máximo de pedágio que ele se nega a pagar
        System.out.print("Informe o valor máximo de pedágio: ");
        double valorLimitePedagio = sc.nextDouble();

        int qtdAcimaLimite = 0;
        int qtdTotalTrechos = 0;
        int qtdAcima150KmAceito = 0;

        // Laço para ler os trechos até que o usuário digite um valor de pedágio negativo
        while (true) {
            System.out.print("\nCusto do pedágio (ou valor negativo para sair): ");
            double pedagio = sc.nextDouble();

            // Condição de parada: se o pedágio for negativo, encerra imediatamente sem ler a distância
            if (pedagio < 0) {
                break;
            }

            System.out.print("Distância do trecho (em Km): ");
            double distancia = sc.nextDouble();

            // Conta mais um trecho informado
            qtdTotalTrechos++;

            // 1. Quantos trechos possuem valor de pedágio acima do limite (que ele se nega a pagar)
            if (pedagio > valorLimitePedagio) {
                qtdAcimaLimite++;
            }

            // 3. Quantos trechos acima de 150Km possuem valor de pedágio aceito por ele (menor ou igual ao limite)
            if (distancia > 150 && pedagio <= valorLimitePedagio) {
                qtdAcima150KmAceito++;
            }
        }

        // Exibe os resultados finais solicitados
        System.out.println("\n--- RESULTADOS DA VIAGEM ---");
        System.out.println("- " + qtdAcimaLimite + " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println("- " + qtdTotalTrechos + " (quantidade de trechos informados);");
        System.out.println("- " + qtdAcima150KmAceito + " (trechos acima de 150km com valor aceito por ele).");

        sc.close();
    }
}
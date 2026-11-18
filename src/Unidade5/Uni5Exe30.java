/*
 * Uni5Exe30.java - Implemente o problema da mochila com uma sequência decrescente de números inteiros 
 * positivos que inicia em N, com decremento K, empacotando-os em uma mochila de tamanho M (preferindo os maiores).
 * O algoritmo imprime:
 * - os elementos a serem colocados na mochila (a sequência gerada);
 * - os elementos que entraram na mochila;
 * - os que ficaram fora da mochila;
 * - qual é a soma dos elementos que entraram;
 * - qual a soma dos elementos que não entraram.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos parâmetros N (início), K (decremento) e M (tamanho/capacidade da mochila)
        System.out.print("Informe o valor inicial N da sequência: ");
        int n = sc.nextInt();

        System.out.print("Informe o valor do decremento K: ");
        int k = sc.nextInt();

        System.out.print("Informe o tamanho M da mochila (quantidade máxima de itens): ");
        int m = sc.nextInt();

        // Como a sequência é decrescente e precisa preferir os maiores valores até encher M,
        // geramos a sequência e armazenamos em vetores temporários para ordená-la do maior para o menor.
        
        // Primeiro, contamos quantos elementos a sequência possui (enquanto forem maiores que 0)
        int quantidadeTotal = 0;
        int tempN = n;
        while (tempN > 0) {
            quantidadeTotal++;
            tempN -= k;
        }

        // Criamos vetores para guardar a sequência gerada
        int[] sequencia = new int[quantidadeTotal];
        int idx = 0;
        tempN = n;
        while (tempN > 0) {
            sequencia[idx] = tempN;
            idx++;
            tempN -= k;
        }

        // Ordena a sequência em ordem decrescente (do maior para o menor) para garantir a preferência
        for (int i = 0; i < sequencia.length - 1; i++) {
            for (int j = 0; j < sequencia.length - 1 - i; j++) {
                if (sequencia[j] < sequencia[j + 1]) {
                    int aux = sequencia[j];
                    sequencia[j] = sequencia[j + 1];
                    sequencia[j + 1] = aux;
                }
            }
        }

        // 1. Imprime os elementos da sequência gerada (a serem colocados/disponíveis)
        System.out.print("\nElementos da sequência gerada: [");
        for (int i = 0; i < sequencia.length; i++) {
            System.out.print(sequencia[i]);
            if (i < sequencia.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Vetores para separar quem entrou e quem ficou fora da mochila
        // O tamanho da mochila M define quantos elementos entram no máximo
        int tamanhoMochilaEfetivo = Math.min(m, sequencia.length);
        int[] mochila = new int[tamanhoMochilaEfetivo];
        
        int tamanhoFora = sequencia.length - tamanhoMochilaEfetivo;
        int[] foraMochila = new int[tamanhoFora];

        int somaDentro = 0;
        int somaFora = 0;

        int idxMochila = 0;
        int idxFora = 0;

        // Distribui os elementos entre a mochila e o lado de fora com base no limite M
        for (int i = 0; i < sequencia.length; i++) {
            if (i < m) {
                mochila[idxMochila] = sequencia[i];
                somaDentro += sequencia[i];
                idxMochila++;
            } else {
                foraMochila[idxFora] = sequencia[i];
                somaFora += sequencia[i];
                idxFora++;
            }
        }

        // 2. Imprime os elementos que entraram na mochila
        System.out.print("Elementos que ENTRARAM na mochila: [");
        for (int i = 0; i < mochila.length; i++) {
            System.out.print(mochila[i]);
            if (i < mochila.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 3. Imprime os elementos que ficaram fora da mochila
        System.out.print("Elementos que FICARAM FORA da mochila: [");
        for (int i = 0; i < foraMochila.length; i++) {
            System.out.print(foraMochila[i]);
            if (i < foraMochila.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 4 e 5. Imprime as somas
        System.out.println("Soma dos elementos que ENTRARAM: " + somaDentro);
        System.out.println("Soma dos elementos que FICARAM FORA: " + somaFora);

        sc.close();
    }
}
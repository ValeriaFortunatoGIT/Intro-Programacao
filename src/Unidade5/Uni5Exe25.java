/*
 * Uni5Exe25.java - Em uma disputa de pingue-pongue os pontos são anotados como D (direito) e E (esquerdo). 
 * O algoritmo lê o código do ponto de cada jogada e determina o vencedor com base nas regras de pontuação e diferença de 2 pontos.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pontosDireito = 0;
        int pontosEsquerdo = 0;
        boolean partidaEmAndamento = true;

        System.out.println("Digite 'D' para ponto do jogador direito, 'E' para o esquerdo.");

        // O laço continua rodando enquanto a partida não tiver um vencedor definido
        while (partidaEmAndamento) {
            System.out.print("Quem marcou ponto (D/E)? ");
            char ponto = sc.next().toUpperCase().charAt(0); // Lê a letra e converte para maiúsculo

            // Conta o ponto para o jogador correspondente
            if (ponto == 'D') {
                pontosDireito++;
            } else if (ponto == 'E') {
                pontosEsquerdo++;
            } else {
                System.out.println("Código inválido! Digite apenas D ou E.");
                continue; // Volta para o início do while se a letra for inválida
            }

            // Calcula a diferença absoluta de pontos entre os dois jogadores
            int diferenca = Math.abs(pontosDireito - pontosEsquerdo);

            // Condição 1: Um dos jogadores chegou a 21 ou mais E a diferença é de pelo menos 2 pontos
            if ((pontosDireito >= 21 || pontosEsquerdo >= 21) && diferenca >= 2) {
                partidaEmAndamento = false; // Encerra o loop
            }
        }

        // Mostra o resultado final e quem foi o vencedor
        System.out.println("\n--- FIM DE JOGO ---");
        System.out.println("Placar final -> Direito: " + pontosDireito + " | Esquerdo: " + pontosEsquerdo);
        
        if (pontosDireito > pontosEsquerdo) {
            System.out.println("O vencedor é o jogador do lado DIREITO!");
        } else {
            System.out.println("O vencedor é o jogador do lado ESQUERDO!");
        }

        sc.close();
    }
}
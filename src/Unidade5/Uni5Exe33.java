/*
 * Uni5Exe33.java - Eleição para presidência com 4 candidatos. 
 * Codificação: 1, 2, 3, 4 = candidatos; 5 = nulo; 6 = em branco; 0 = encerrar.
 * Se informado valor incorreto, emitir "Opção incorreta" e persistir.
 * Calcula e escreve: total de votos para cada candidato, nulos, em branco e percentuais.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contadores de votos
        int votoCandidato1 = 0;
        int votoCandidato2 = 0;
        int votoCandidato3 = 0;
        int votoCandidato4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int totalVotos = 0;

        int opcao = -1;

        // Laço principal que roda até o usuário digitar 0 para encerrar
        do {
            System.out.print("Informe o voto (1 a 4 para candidatos, 5 para nulo, 6 para branco, 0 para sair): ");
            opcao = sc.nextInt();

            // Verifica a opção digitada
            if (opcao == 0) {
                break; // Encerra a votação
            } else if (opcao == 1) {
                votoCandidato1++;
                totalVotos++;
            } else if (opcao == 2) {
                votoCandidato2++;
                totalVotos++;
            } else if (opcao == 3) {
                votoCandidato3++;
                totalVotos++;
            } else if (opcao == 4) {
                votoCandidato4++;
                totalVotos++;
            } else if (opcao == 5) {
                votoNulo++;
                totalVotos++;
            } else if (opcao == 6) {
                votoBranco++;
                totalVotos++;
            } else {
                // Mensagem exigida quando a opção for incorreta
                System.out.println("Opção incorreta");
            }

        } while (opcao != 0);

        // Exibe os resultados da eleição
        System.out.println("\n--- RESULTADO DA ELEIÇÃO ---");
        System.out.println("Total de votos para o Candidato 1: " + votoCandidato1);
        System.out.println("Total de votos para o Candidato 2: " + votoCandidato2);
        System.out.println("Total de votos para o Candidato 3: " + votoCandidato3);
        System.out.println("Total de votos para o Candidato 4: " + votoCandidato4);
        System.out.println("Total de votos nulos: " + votoNulo);
        System.out.println("Total de votos em branco: " + votoBranco);

        // Calcula os percentuais de brancos e nulos sobre o total de votos (se houver votos)
        if (totalVotos > 0) {
            double percNulos = (votoNulo * 100.0) / totalVotos;
            double percBrancos = (votoBranco * 100.0) / totalVotos;

            System.out.printf("Percentual de votos nulos sobre o total: %.2f%%\n", percNulos);
            System.out.printf("Percentual de votos em branco sobre o total: %.2f%%\n", percBrancos);
        } else {
            System.out.println("Nenhum voto foi registrado na eleição.");
        }

        sc.close();
    }
}
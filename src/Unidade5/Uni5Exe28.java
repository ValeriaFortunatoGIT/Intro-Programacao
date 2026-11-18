/*
 * Uni5Exe28.java - Uma emissora de rádio promoveu uma eleição para escolher o melhor conjunto do ano (1=Nenhum de Nós, 2=CPM22, 3=Skank, 4=Jota Quest).
 * O algoritmo informa:
 * - total de votos para cada grupo;
 * - percentual dos votos para cada grupo;
 * - o grupo vencedor.
 * Pergunta antes de cada voto: "mais um voto: s (SIM) / n (NÃO)?"
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contadores de votos para cada conjunto
        int votosNenhumDeNos = 0;
        int votosCpm22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;

        char continuar = 's';

        // Laço principal que pergunta se deseja computar mais um voto
        while (true) {
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = sc.next().toLowerCase().charAt(0);

            if (continuar == 'n') {
                break; // Encerra a votação se o usuário digitar 'n'
            } else if (continuar != 's') {
                System.out.println("Opção inválida! Digite 's' para sim ou 'n' para não.");
                continue;
            }

            // Lê o código do conjunto votado
            System.out.print("Informe o código do conjunto (1=Nenhum de Nós, 2=CPM22, 3=Skank, 4=Jota Quest): ");
            int codigo = sc.nextInt();

            // Computa o voto conforme o código informado
            switch (codigo) {
                case 1:
                    votosNenhumDeNos++;
                    totalVotos++;
                    break;
                case 2:
                    votosCpm22++;
                    totalVotos++;
                    break;
                case 3:
                    votosSkank++;
                    totalVotos++;
                    break;
                case 4:
                    votosJotaQuest++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Código de conjunto inválido! Voto não contabilizado.");
                    break;
            }
        }

        // Exibe os resultados se houver pelo menos um voto computado
        System.out.println("\n--- RESULTADO DA ELEIÇÃO ---");
        if (totalVotos > 0) {
            // Calcula os percentuais (multiplicando por 100.0 para garantir divisão com ponto flutuante)
            double percNenhumDeNos = (votosNenhumDeNos * 100.0) / totalVotos;
            double percCpm22 = (votosCpm22 * 100.0) / totalVotos;
            double percSkank = (votosSkank * 100.0) / totalVotos;
            double percJotaQuest = (votosJotaQuest * 100.0) / totalVotos;

            // Mostra total e percentual para cada grupo
            System.out.println("Nenhum de Nós -> Total de votos: " + votosNenhumDeNos + " | Percentual: " + String.format("%.2f", percNenhumDeNos) + "%");
            System.out.println("CPM22         -> Total de votos: " + votosCpm22 + " | Percentual: " + String.format("%.2f", percCpm22) + "%");
            System.out.println("Skank         -> Total de votos: " + votosSkank + " | Percentual: " + String.format("%.2f", percSkank) + "%");
            System.out.println("Jota Quest    -> Total de votos: " + votosJotaQuest + " | Percentual: " + String.format("%.2f", percJotaQuest) + "%");

            // Determina o grupo vencedor (verificando qual tem o maior número de votos)
            int maiorVotos = votosNenhumDeNos;
            String vencedor = "Nenhum de Nós";

            if (votosCpm22 > maiorVotos) {
                maiorVotos = votosCpm22;
                vencedor = "CPM22";
            }
            if (votosSkank > maiorVotos) {
                maiorVotos = votosSkank;
                vencedor = "Skank";
            }
            if (votosJotaQuest > maiorVotos) {
                maiorVotos = votosJotaQuest;
                vencedor = "Jota Quest";
            }

            System.out.println("\nO grupo vencedor é: " + vencedor + " com " + maiorVotos + " votos!");
        } else {
            System.out.println("Nenhum voto foi computado na eleição.");
        }

        sc.close();
    }
}

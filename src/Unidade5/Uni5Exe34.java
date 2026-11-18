/*
 * Uni5Exe34.java - Sistema de hotelaria. 
 * O hotel cobra R$ 50,00 de diária por hóspede + taxa de serviços:
 * - R$ 7,50 por diária (se diárias < 15);
 * - R$ 6,50 por diária (se diárias == 15);
 * - R$ 5,00 por diária (se diárias > 15).
 * Opções do recepcionista:
 * (1) Encerrar a conta de um hóspede (lê nome e diárias, escreve nome e total a ser pago);
 * (2) Verificar número de contas encerradas (total de hóspedes que deixaram o hotel);
 * (3) Sair.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contasEncerradas = 0;
        int opcao = 0;

        // Laço principal do menu interativo
        do {
            System.out.println("\n--- MENU HOTEL ---");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                // Lê o nome do hóspede
                System.out.print("Informe o nome do hóspede: ");
                String nome = sc.next();

                // Lê o número de diárias
                System.out.print("Informe o número de diárias: ");
                int diarias = sc.nextInt();

                double taxaServicos = 0;

                // Calcula a taxa de serviços conforme a regra das diárias
                if (diarias < 15) {
                    taxaServicos = 7.50;
                } else if (diarias == 15) {
                    taxaServicos = 6.50;
                } else {
                    taxaServicos = 5.00;
                }

                // Cálculo do valor total: (50.00 + taxaServicos) * número de diárias
                // Nota: O enunciado diz "R$ 50,00 de diária por hóspede e mais uma taxa de serviços... de por diária"
                double totalPagar = diarias * (50.00 + taxaServicos);

                // Exibe o nome e o total a ser pago
                System.out.println("\n--- CONTA DO HÓSPEDE ---");
                System.out.println("Hóspede: " + nome);
                System.out.printf("Total a ser pago: R$ %.2f\n", totalPagar);

                // Incrementa o contador de contas encerradas
                contasEncerradas++;

            } else if (opcao == 2) {
                // Informa o número de hóspedes que já deixaram o hotel
                System.out.println("\nNúmero de contas encerradas até o momento: " + contasEncerradas);

            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 3);

        sc.close();
    }
}
/*
 * Uni5Exe27.java - Uma fábrica paga funcionários em Abril conforme regras de turno e quinzena. 
 * O programa valida o dia (1 a 30), lê a produção da manhã e da tarde, calcula o valor recebido, 
 * pergunta se deseja cadastrar um novo funcionário e, ao final, responde em qual dia ocorreu a 
 * maior produção e em qual período (manhã ou tarde) produziu mais no geral.
 */

package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis para armazenar estatísticas gerais ao longo dos funcionários/dias
        int maiorProducaoDia = -1;
        double maiorTotalDia = -1;

        int totalPecasManhaGeral = 0;
        int totalPecasTardeGeral = 0;

        int opcaoNovoFuncionario = 1;

        // Laço principal para repetir enquanto o usuário quiser cadastrar funcionários (1.sim 2.não)
        while (opcaoNovoFuncionario == 1) {
            int dia = 0;

            // Validação do dia do mês de Abril (1 a 30)
            while (true) {
                System.out.print("Informe o dia do mês de Abril (1 a 30): ");
                dia = sc.nextInt();

                if (dia >= 1 && dia <= 30) {
                    break; // Dia válido, sai do laço de validação
                } else {
                    System.out.println("Dia inválido");
                }
            }

            // Leitura da produção da manhã e da tarde
            System.out.print("Produção no turno da manhã: ");
            int pecasManha = sc.nextInt();

            System.out.print("Produção no turno da tarde: ");
            int pecasTarde = sc.nextInt();

            // Soma a produção geral por período para responder qual período produz mais no total
            totalPecasManhaGeral += pecasManha;
            totalPecasTardeGeral += pecasTarde;

            int totalPecasDia = pecasManha + pecasTarde;

            // Verifica se este dia teve a maior produção total registrada até agora
            if (totalPecasDia > maiorTotalDia) {
                maiorTotalDia = totalPecasDia;
                maiorProducaoDia = dia;
            }

            double valorRecebido = 0;

            // Regras para a primeira quinzena (1 a 15)
            if (dia >= 1 && dia <= 15) {
                if (totalPecasDia > 100 && pecasManha >= 30 && pecasTarde >= 30) {
                    valorRecebido = totalPecasDia * 0.80;
                } else {
                    valorRecebido = totalPecasDia * 0.50;
                }
            } 
            // Regras para a segunda quinzena (16 a 30)
            else {
                valorRecebido = (pecasManha * 0.40) + (pecasTarde * 0.30);
            }

            // Exibe o valor recebido pelo funcionário no dia
            System.out.printf("R$ %.2f (valor recebido)\n", valorRecebido);

            // Pergunta se deseja cadastrar um novo funcionário
            System.out.print("Novo funcionário: (1.sim 2.não)? ");
            opcaoNovoFuncionario = sc.nextInt();
        }

        // Exibe as respostas finais solicitadas pelo exercício
        System.out.println("\n--- RESULTADOS FINAIS ---");
        System.out.println("O dia em que ocorreu a maior produção foi o dia: " + maiorProducaoDia);

        if (totalPecasManhaGeral > totalPecasTardeGeral) {
            System.out.println("O período em que o funcionário mais produziu no geral foi a MANHÃ, com um total de " + totalPecasManhaGeral + " peças.");
        } else if (totalPecasTardeGeral > totalPecasManhaGeral) {
            System.out.println("O período em que o funcionário mais produziu no geral foi a TARDE, com um total de " + totalPecasTardeGeral + " peças.");
        } else {
            System.out.println("Houve um empate na produção entre os turnos da manhã e da tarde (" + totalPecasManhaGeral + " peças cada).");
        }

        sc.close();
    }
}
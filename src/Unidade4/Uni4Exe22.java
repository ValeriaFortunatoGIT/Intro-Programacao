package Unidade4;

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        // Declaração das variáveis no início
        int opcao;
        String titulacao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o curso: 1 - Ciência da Computação, 2 - Licenciatura da Computação, 3 - Sistemas de Informação): ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                titulacao = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulacao = "Licenciado em Computação";
                break;
            case 3:
                titulacao = "Bacharel em Sistemas de Informação";
                break;
            default:
                titulacao = "Opção inválida";
                break;
        }

        System.out.println(titulacao);
    }
}
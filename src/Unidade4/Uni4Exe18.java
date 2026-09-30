package Unidade4;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaVencimento;
        int diaPagamento;
        double valorPrestacao;
        int diasAtraso; 
        double percentualMulta;
        double valorFinal;

        System.out.print("Dia do vencimento: ");
        diaVencimento = sc.nextInt();

        System.out.print("Dia do pagamento: ");
        diaPagamento = sc.nextInt();

        System.out.print("Valor da prestacao: ");
        valorPrestacao = sc.nextDouble();

        diasAtraso = diaPagamento - diaVencimento;

        if (diasAtraso <= 0) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("O pagamento está em dia.");
            System.out.printf("O valor da prestação = R$ %.2f\n", valorFinal);

        } else if (diasAtraso <= 5) {
            System.out.println("O pagamento está atrasado.");
            System.out.printf("O valor da prestação = R$ %.2f\n", valorPrestacao);

        } else {
            percentualMulta = diasAtraso * 0.02;
            valorFinal = valorPrestacao + (valorPrestacao * percentualMulta);
            
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso.");
            System.out.printf("Valor da prestação = R$ %.2f.\n", valorFinal);
        }

    }
}
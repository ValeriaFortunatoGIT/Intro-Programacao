package Unidade4;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {

        double nota1, nota2, nota3, notaExercicios, ma;
        char conceito;
        String status;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a nota da Prova 3: ");
        nota3 = sc.nextDouble();

        System.out.print("Digite a media dos exercicios: ");
        notaExercicios = sc.nextDouble();

        ma = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicios) / 7.0;

        if (ma >= 9.0) {
            conceito = 'A';
            status = "Aprovado";
        } else if (ma >= 7.5) {
            conceito = 'B';
            status = "Aprovado";
        } else if (ma >= 6.0) {
            conceito = 'C';
            status = "Aprovado";
        } else if (ma >= 4.0) {
            conceito = 'D';
            status = "Reprovado";
        } else {
            conceito = 'E';
            status = "Reprovado";
        }

        System.out.printf("A média de aproveitamento foi: %.2f, conceito: %c. %s\n", ma, conceito, status);

    }
}
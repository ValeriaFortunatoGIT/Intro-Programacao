package Unidade3;

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double horas;
        int dependentes;
        double salarioTrabalho;
        double salarioFamilia;
        double salarioBruto;
        double salarioLiquido;
        double inss;
        double impostoRenda;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Quantidade de horas trabalhadas no mês: ");
        horas = sc.nextDouble();

        System.out.print("Número de dependentes: ");
        dependentes = sc.nextInt();

        salarioTrabalho = horas * 10;
        salarioFamilia = dependentes * 60;

        salarioBruto = salarioTrabalho + salarioFamilia;

        inss = salarioTrabalho * 0.085;
        impostoRenda = salarioTrabalho * 0.05;

        salarioLiquido = salarioBruto - inss - impostoRenda;

        System.out.printf("O funcionário %s possui um salario bruto de R$%.2f e um salário líquido de R$%.2f%n",
                nome, salarioBruto, salarioLiquido);

    }
}
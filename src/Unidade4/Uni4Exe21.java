package Unidade4;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {

        double altura, massa, imc;
        String classificacao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        altura = sc.nextDouble();

        System.out.print("Massa: ");
        massa = sc.nextDouble();

        imc = massa / (altura * altura);

        if (imc < 18.5) {
            classificacao = "Magreza";
        } 
        else if (imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.println(classificacao);
    }
}
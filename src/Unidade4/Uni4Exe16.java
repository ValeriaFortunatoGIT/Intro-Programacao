package Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {

        int homemVelho, homemNovo;
        int mulherVelha, mulherNova;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem: ");
        int homem1 = sc.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        int homem2 = sc.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        int mulher1 = sc.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        int mulher2 = sc.nextInt();

        if (homem1 > homem2) {
            homemVelho = homem1;
            homemNovo = homem2;
        } else {
            homemVelho = homem2;
            homemNovo = homem1;
        }

        if (mulher1 > mulher2) {
            mulherVelha = mulher1;
            mulherNova = mulher2;
        } else {
            mulherVelha = mulher2;
            mulherNova = mulher1;
        }

        int soma = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

    }
}
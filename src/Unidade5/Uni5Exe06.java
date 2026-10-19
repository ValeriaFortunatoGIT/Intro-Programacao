package Unidade5;

import java.util.Scanner;

public class Uni5Exe06 {
    
    public static void main(String[] args) {

//Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

        Scanner sc = new Scanner(System.in);

        double media = 0, altura;

        for (int i = 0; i < 20; i++) {
            System.out.println("Altura da pessoa " + (i + 1) + ": ");
            altura = sc.nextDouble();
            media += altura;
        }

        System.out.println("A média das alturas é: " + (media / 20));

    }
}
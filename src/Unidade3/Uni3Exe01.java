package Unidade3;

import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comprimento;
        double largura;
        double area;

        System.out.print("Digite o comprimento: ");
        comprimento = sc.nextDouble();

        System.out.print("Digite a largura: ");
        largura = sc.nextDouble();

        area = comprimento * largura;

        System.out.println("Área do terreno: " + area);

    }
}
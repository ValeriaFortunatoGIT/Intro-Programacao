package Unidade3;

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double catetoOposto;
        double catetoAdjacente;
        double hipotenusa;

        System.out.print("Cateto oposto: ");
        catetoOposto = sc.nextDouble();

        System.out.print("Cateto adjacente: ");
        catetoAdjacente = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));

        System.out.printf("A hipotenusa é: %.2f%n", hipotenusa);

    }
}
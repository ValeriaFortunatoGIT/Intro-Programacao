package Unidade2;

import java.util.Scanner;

public class Uni2Exe12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        System.out.println("Valor de x1:");
        x1 = sc.nextDouble();

        System.out.println("Valor de y1:");
        y1 = sc.nextDouble();

        System.out.println("Valor de x2:");
        x2 = sc.nextDouble();

        System.out.println("Valor de y2:");
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distância entre os pontos: %.4f", distancia);

    }

}
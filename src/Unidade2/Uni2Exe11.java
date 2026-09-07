package Unidade2;

import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float A,B,C,areaT,areaTr,areaQ,areaR;
        double pi = Math.PI, areaC;
        pi = 3.14159;

        System.out.println("Questão A) - Área do Triângulo retângulo");
        System.out.println("Valor da base:");
        A = sc.nextFloat();

        System.out.println("Valor da altura:");
        C = sc.nextFloat();

        areaT = A*C/2;
        System.out.printf("Área do triângulo retângulo: %.2f",areaT);
        System.out.println("\n------------------");
        System.out.println("\nQuestão B) - Área do círculo");
        System.out.println("Valor do raio: ");
        C = sc.nextFloat();
        areaC = Math.pow(C,2)* Math.PI;

        System.out.printf("Área do círculo: %.2f",areaC);
        System.out.println("\n------------------");
        System.out.println("\nQuestão C) - Área do Trapézio");
        System.out.println("Valor da primeira base:");
        A = sc.nextFloat();

        System.out.println("Valor da segunda base:");
        B = sc.nextFloat();

        System.out.println("Valor da altura:");
        C = sc.nextFloat();
        areaTr = (A+B)*C/2f;

        System.out.printf("Área do trapézio: %.2f",areaTr);
        System.out.println("\n------------------");
        System.out.println("\nQuestão D) - Área do Quadrado");
        System.out.println("Valor do lado:");
        B = sc.nextFloat();
        areaQ = B*B;

        System.out.printf("Área do quadrado: %.2f",areaQ);
        System.out.println("\n------------------");
        System.out.println("\nQuestão E) - Área do Retângulo");
        System.out.println("Valor da base: ");
        A = sc.nextFloat();
        System.out.println("Valor da altura: ");
        B = sc.nextFloat();
        areaR = A*B;


        System.out.printf("Área do retângulo: %.2f", areaR);

    }
}
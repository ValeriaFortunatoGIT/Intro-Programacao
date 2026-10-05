package Prova1;

import java.util.Scanner;

public class ProvaAQ2 {
public static void main(String[] args) {
 

        float lado1, lado2, lado3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado 1: ");
        lado1 = sc.nextFloat();

        System.out.println("Digite o lado 2: ");
        lado2 = sc.nextFloat();

        System.out.println("Digite o lado 3: ");
        lado3 = sc.nextFloat();

        if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0){
            System.out.println("medidas invalidas");
        }else if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("triângulo isósceles");
            } else {
                System.out.println("triângulo escaleno");
            }
        } else {
            System.out.println("não forma triangulo");
        }
    }
}



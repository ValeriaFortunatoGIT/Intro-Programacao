package Unidade4;

import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {

        float lado1, lado2, lado3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1: ");
        lado1 = sc.nextFloat();

        System.out.println("Digite o comprimento do lado 2: ");
        lado2 = sc.nextFloat();

        System.out.println("Digite o comprimento do lado 3: ");
        lado3 = sc.nextFloat();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            // na linha de cima esta verificando se é realmente um triangulo, se for realmente um triangulo
            //vai para o if de baixo para ver qual tipo de triangulo é
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É um triângulo equilátero");

            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É um triângulo isósceles");

            } else {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }
    }
}
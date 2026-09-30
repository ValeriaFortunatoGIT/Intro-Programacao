package EstudosProva;

import java.util.Scanner;

public class Exe02 {
public static void main(String[] args) {

    //Leia 2 valores inteiros e imprima sua multiplicação.

    Scanner sc = new Scanner(System.in);

    int num1, num2, multiplicação;

    System.out.println("Digite o primeiro numero: ");
    num1 = sc.nextInt();

    System.out.println("Digite o segundo numero: ");
    num2 = sc.nextInt();

    multiplicação = num1 * num2;

    System.out.println("O resultado da multiplicação é: " + multiplicação);


}
}

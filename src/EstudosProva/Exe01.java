package EstudosProva;

import java.util.Scanner;

public class Exe01 {
public static void main(String[] args) {
    
    //Leia 2 valores inteiros e imprima sua soma.

    int num1,num2, soma;
    Scanner sc =  new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    num1 = sc.nextInt();

    
    System.out.println("Digite o segundo numero: ");
    num2 = sc.nextInt();

    soma = num1 + num2;

    System.out.println("A soma dos 2 numeros é: " + soma);


 
}
}

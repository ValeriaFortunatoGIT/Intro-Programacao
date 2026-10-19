package Unidade5;

import java.util.Scanner;

public class Uni5Exe05 {
public static void main(String[] args) {

//Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
//normalsize&space;\frac{1}{1}+\frac{1}{2}+\frac{1}{3}+\frac{1}{4}+\cdots+\frac{1}{100
//O valor n deve ser lido e deve ser maior do que 2.

    Scanner sc =  new Scanner(System.in);
    System.out.println("Informe o numero decimal: ");
    int numero = sc.nextInt();
    System.out.println("Informe a quantidade: ");
    int qtde = sc.nextInt();

    for(int i = 0; i <qtde; i++){
        System.out.print(numero + "," + (numero + 2) + ",");
        numero = numero*2;
    }
}
}

package Unidade5;

import java.util.Scanner;

public class Uni5Exe05 {
public static void main(String[] args) {
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

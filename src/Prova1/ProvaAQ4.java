package Prova1;

import java.util.Scanner;

public class ProvaAQ4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int saque;
    int nota100, nota50, nota20, nota10;


    System.out.println("Digite o valor que deseja sacar: ");
    saque = sc.nextInt();

    if(saque <=0 || saque > 1000 || saque % 10 == 1 ){
       System.out.println("Valor de saque invalido");
    }

    nota100 = saque / 100;
    saque = saque % 100;

    nota50 = saque / 50;
    saque = saque % 50;

    nota20 = saque / 20;
    saque = saque % 20;

    nota10 = saque / 10;
    saque = saque % 10;

    System.out.println(nota100 + ": notas de 100");
    System.out.println(nota50 + ": notas de 50");
    System.out.println(nota20 + ": notas de 20");
    System.out.println(nota10 + ": notas de 10");

}
}

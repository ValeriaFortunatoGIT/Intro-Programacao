package Unidade2;
import java.util.Scanner;

public class Uni2Exe15 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um valor: ");
    double valor = sc.nextFloat();
    double nota100, nota50, nota20, nota10, nota5, nota2;
    double moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;

    nota100 = valor / 100;
    valor = valor % 100;

    nota50 = valor / 50;
    valor = valor % 50;

    nota20 = valor / 20;
    valor = valor % 20;

    nota10 = valor / 10;
    valor = valor % 10;

    nota5 = valor / 5;
    valor = valor % 5;

    nota2 = valor / 2;
    valor = valor % 2;



    moeda1 = valor /  1;
    valor = valor % 1;

    moeda50 = valor / 0.50;
    valor = valor % 0.50;

    moeda25 = valor / 0.25;
    valor = valor % 0.25;

    moeda10 = valor / 0.10;
    valor = valor % 0.10;

    moeda5 = valor / 0.05;
    valor = valor % 0.05;

    moeda1 = valor / 0.01;
    valor = valor % 0.01;

    System.out.println(nota100 + ": notas de 100");
    System.out.println(nota50 + ": notas de 50");
    System.out.println(nota20 + ": notas de 20");
    System.out.println(nota10 + ": notas de 10");
    System.out.println(nota5 + ": notas de 5");
    System.out.println(nota2 + ": notas de 2");

    System.out.println(moeda1 + ": moedas de 1");
    System.out.println(moeda50 + ": moedas de 0.50");
    System.out.println(moeda25 + ": moedas de 0.25");
    System.out.println(moeda10+ ": moedas de 0.10");
    System.out.println(moeda5 + ": moedas de 0.05");
    System.out.println(moeda1 + ": moedas de 0.01");

}
}

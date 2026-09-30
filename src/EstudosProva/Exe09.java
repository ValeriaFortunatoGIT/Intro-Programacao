package EstudosProva;

import java.util.Scanner;

public class Exe09 {
public static void main(String[] args) {
    
    double dolares, cotacao, valorReal;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe quantos dolares voce quer trocar por reias: ");
    dolares = sc.nextDouble();

    System.out.println("Informe a cotação do dolar: ");
    cotacao = sc.nextDouble();

    valorReal = dolares * cotacao;

    System.out.println("A atendente deve devoler " + valorReal + " reais ");




}
}

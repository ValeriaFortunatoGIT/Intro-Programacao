package Unidade3;

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int centena;
        int dezena;
        int unidade;

        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();

        centena = numero / 100;
        dezena = (numero / 10) % 10;
        unidade = numero % 10;

        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");

    }
}
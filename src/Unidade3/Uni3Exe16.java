package Unidade3;

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int compra;
        int pagamento;
        int troco;
        int notas100;
        int notas10;
        int notas1;
        int totalNotas;

        System.out.print("Valor total da compra: ");
        compra = sc.nextInt();

        System.out.print("Valor total dado pelo cliente: ");
        pagamento = sc.nextInt();

        troco = pagamento - compra;

        notas100 = troco / 100;
        troco = troco % 100;

        notas10 = troco / 10;
        troco = troco % 10;

        notas1 = troco;

        totalNotas = notas100 + notas10 + notas1;

        System.out.println("O numero minimo de notas de troco é: " + totalNotas);
        System.out.println("Quantidade de notas de 100 necessarias é: " + notas100);
        System.out.println("Quantidade de notas de 10 necessarias é: " + notas10);
        System.out.println("Quantidade de notas de 1 necessarias é: " + notas1);

        sc.close();
    }
}
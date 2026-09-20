package Unidade3;

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int frangos;
        double gastoTotal;

        System.out.print("Digite a quantidade de frangos: ");
        frangos = sc.nextInt();

        gastoTotal = frangos * 11.00;

        System.out.println("O gasto total para marcar " + frangos + " é: "  + gastoTotal);

    }
}
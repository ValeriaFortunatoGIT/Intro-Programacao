package Unidade4;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meses;

        System.out.print("Digite a quantidade de meses que o funcionario foi admitido: ");
        meses = sc.nextInt();

        if (meses >= 1 && meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }
    }
}
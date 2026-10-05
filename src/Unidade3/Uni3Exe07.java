package Unidade3;

import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtd350;
        int qtd600;
        int qtd2L;
        float totalLitros;

        System.out.println("Quantidade de 350ml: ");
        qtd350 = sc.nextInt();

        System.out.println("Quantidade de 600ml: ");
        qtd600 = sc.nextInt();

        System.out.println("Quantidade de 2L: ");
        qtd2L = sc.nextInt();

        totalLitros = (qtd350 * 0.350f) + (qtd600 * 0.600f) + (qtd2L * 2);

        System.out.printf("O cliente comprou ao total %.2f litros.%n", totalLitros);

        sc.close();
    }
}


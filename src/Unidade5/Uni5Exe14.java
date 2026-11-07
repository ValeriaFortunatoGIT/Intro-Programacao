package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int lucroMenor10 = 0;
        int lucroEntre1020 = 0;
        int lucroMaior20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;

        for (int i = 0; i < 20; i++) {
            String nome = teclado.next();
            double pc = teclado.nextDouble();
            double pv = teclado.nextDouble();

            double percentualLucro = ((pv - pc) / pc) * 100;

            if (percentualLucro < 10) {
                lucroMenor10++;
            } else if (percentualLucro <= 20) {
                lucroEntre1020++;
            } else {
                lucroMaior20++;
            }

            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + lucroEntre1020);
        System.out.println("Mercadorias com lucro > 20%: " + lucroMaior20);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

    }
}
package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o limite diário de pesca (em kg): ");
        double limiteKg = sc.nextDouble();
        double limiteGramas = limiteKg * 1000.0;

        double pesoTotalGramas = 0;
        char continuar = 's';

        while ((continuar == 's' || continuar == 'S') && pesoTotalGramas < limiteGramas) {
            System.out.print("Informe o peso do peixe (em gramas): ");
            double pesoPeixe = sc.nextDouble();

            pesoTotalGramas += pesoPeixe;

            System.out.printf("Peso total da pesca até agora: %.1fg (%.3fkg)%n", pesoTotalGramas, (pesoTotalGramas / 1000.0));

            if (pesoTotalGramas > limiteGramas) {
                System.out.println("Limite diário excedido!");
                break;
            }

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = sc.next().charAt(0);
        }

    }
}
package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double altura = teclado.nextDouble();
        
        double somaAlturaFeminino = 0;
        int qtdFeminino = 0;
        
        double somaAlturaGrupo = 0;
        int qtdGrupo = 0;

        while (altura != 0) {
            char genero = teclado.next().charAt(0);

            somaAlturaGrupo += altura;
            qtdGrupo++;

            if (genero == 'F' || genero == 'f') {
                somaAlturaFeminino += altura;
                qtdFeminino++;
            }

            altura = teclado.nextDouble();
        }

        if (qtdFeminino > 0) {
            double mediaFeminino = somaAlturaFeminino / qtdFeminino;
            System.out.printf("A média da altura das mulheres é: %.2f%n", mediaFeminino);
        }

        if (qtdGrupo > 0) {
            double mediaGrupo = somaAlturaGrupo / qtdGrupo;
            System.out.printf("A média de altura do grupo é: %.2f%n", mediaGrupo);
        }

    }
}
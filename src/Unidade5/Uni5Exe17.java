package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int inscricao = sc.nextInt();

        int inscricaoMaisAlto = 0;
        double maiorAltura = 0;

        int inscricaoMaisBaixo = 0;
        double menorAltura = 0;

        double somaAlturas = 0;
        int qtdAtletas = 0;

        boolean primeiro = true;

        while (inscricao != 0) {
            double altura = sc.nextDouble();

            if (primeiro) {
                maiorAltura = altura;
                inscricaoMaisAlto = inscricao;
                menorAltura = altura;
                inscricaoMaisBaixo = inscricao;
                primeiro = false;
            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    inscricaoMaisAlto = inscricao;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    inscricaoMaisBaixo = inscricao;
                }
            }

            somaAlturas += altura;
            qtdAtletas++;

            inscricao = sc.nextInt();
        }

        if (qtdAtletas > 0) {
            double mediaAltura = somaAlturas / qtdAtletas;
            System.out.println("O atleta mais baixo tem " + menorAltura + "m e o seu número de inscrição é " + inscricaoMaisBaixo);
            System.out.println("O atleta mais alto tem " + maiorAltura + "m e o seu número de inscrição é " + inscricaoMaisAlto);
            System.out.printf("A altura média do grupo de atletas é: %.2f%n", mediaAltura);
        }

    }
}
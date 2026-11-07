package Unidade5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        String nomes18 = "";
        int qtdAcima20 = 0;

        for (int i = 0; i < n; i++) {
            String nome = teclado.next();
            int idade = teclado.nextInt();

            if (idade == 18) {
                if (nomes18.isEmpty()) {
                    nomes18 = nome;
                } else {
                    nomes18 += " e " + nome;
                }
            }

            if (idade > 20) {
                qtdAcima20++;
            }
        }

        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + qtdAcima20);

    }
}
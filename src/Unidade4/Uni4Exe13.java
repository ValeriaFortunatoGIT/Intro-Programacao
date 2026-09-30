package Unidade4;

import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int carta1, carta2, carta3;
        int boas = 0;

        System.out.println("Digite a carta 1:");
        carta1 = sc.nextInt();

        System.out.println("Digite a carta 2:");
        carta2 = sc.nextInt();

        System.out.println("Digite a carta 3:");
        carta3 = sc.nextInt();

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            boas++;
            //boas = boas + 1, sempre adiciona 1
        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            boas++;
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            boas++;
        }

        if (boas == 1) {
            System.out.println("TRUCO");
        } else if (boas == 2) {
            System.out.println("SEIS");
        } else if (boas == 3) {
            System.out.println("NOVE");
        }
    }
}
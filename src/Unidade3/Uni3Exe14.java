package Unidade3;

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distancia;
        double tempo;
        double velocidadeMedia;
        double combustivel;

        System.out.print("Distancia: ");
        distancia = sc.nextDouble();

        System.out.print("Tempo: ");
        tempo = sc.nextDouble();

        velocidadeMedia = distancia / tempo;
        combustivel = distancia / 12;

        System.out.printf("A velocidade media foi de %.2f km/h e a quantidade de combustivel usado foi %.2f litros.%n",
                velocidadeMedia, combustivel);

    }
}
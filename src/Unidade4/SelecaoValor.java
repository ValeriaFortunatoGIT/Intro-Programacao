package Unidade4;

import java.util.Scanner;

public class SelecaoValor {
    public static void main(String[] args) {
        char tempo;

        System.out.println("Digite uma letra para o tempo de hoje: ");
        System.out.println("S - Sol");
        System.out.println("C - Chuva");
        System.out.println("N - Nublado");
        System.out.println("G - Granizo");
        System.out.println("F - Furacão");
        Scanner sc = new Scanner(System.in);
        tempo = sc.next().toUpperCase().charAt(0);

        switch (tempo) {
            case 'S':
                System.out.println("Hoje tem sol");
                break;
            case 'C':
                System.out.println("Chuvarada");
                break;
            case 'N':
                System.out.println("Tempo não determinado");
                break;
            case 'G':
                System.out.println("Esta caindo pedra");
                break;
            case 'F':
                System.out.println("Esta vindo um furacão");
                break;
        }
    }
}
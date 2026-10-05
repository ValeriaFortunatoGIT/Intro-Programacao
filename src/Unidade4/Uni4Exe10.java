package Unidade4;

import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {

        int Marquinhos, Zezinho, Luluzinha;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do Marquinhos: ");
        Marquinhos = sc.nextInt();

        System.out.println("Digite a idade do Zezinho: ");
        Zezinho = sc.nextInt();

        System.out.println("Digite a idade da Luluzinha: ");
        Luluzinha = sc.nextInt();

        if (Marquinhos < Zezinho && Marquinhos < Luluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (Zezinho < Marquinhos && Zezinho < Luluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");

        }

    }

}


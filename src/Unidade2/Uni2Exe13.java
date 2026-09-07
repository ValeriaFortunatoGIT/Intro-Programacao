package Unidade2;

import java.util.Scanner;

public class Uni2Exe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidadeX = 60;
        int velocidadeY = 90;

        System.out.println("Informe a distancia que o carro Y deseja tomar do carro X: ");
        int distancia = sc.nextInt();

        int diferenca = velocidadeY - velocidadeX;
        int tempo = distancia * 60 / diferenca;

        System.out.println("O carro Y levara " + tempo + " minutos para tomar " + distancia + " Km de distancia do carro X");

    }

}
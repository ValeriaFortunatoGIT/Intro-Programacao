package Unidade2;

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos, quantidadeseg;

        System.out.println("Quantidade de segundos: ");
        quantidadeseg = sc.nextInt();

        horas = quantidadeseg/3600;
        minutos = (quantidadeseg % 3600)/60;
        segundos = quantidadeseg % 60;

        System.out.println(horas+ ":" + minutos + ":" + segundos);
    }

}
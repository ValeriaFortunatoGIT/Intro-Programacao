package Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {

        int horaChegada, minChegada, horaSaida, minSaida;
        int totalMinChegada, totalMinSaida, diferencaMinutos;
        int horasFormatadas, minutosFormatados;
        int horasCobranca;
        double valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("horaChegada: ");
        horaChegada = sc.nextInt();

        System.out.print("minChegada: ");
        minChegada = sc.nextInt();

        System.out.print("horaSaida: ");
        horaSaida = sc.nextInt();

        System.out.print("minSaida: ");
        minSaida = sc.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59 ||
            horaSaida < 0 || horaSaida > 23 || minSaida < 0 || minSaida > 59 ||
            horaSaida < horaChegada || (horaSaida == horaChegada && minSaida < minChegada)) {
            
            System.out.println("Dados de entrada inválidos.");
        } else{
            totalMinChegada = (horaChegada * 60) + minChegada;
            totalMinSaida = (horaSaida * 60) + minSaida;
            diferencaMinutos = totalMinSaida - totalMinChegada;

            horasFormatadas = diferencaMinutos / 60;
            minutosFormatados = diferencaMinutos % 60;

            if (diferencaMinutos < 30) {
                horasCobranca = 1; 
            } else if (minutosFormatados >= 30) {
                horasCobranca = horasFormatadas + 1;
            } else {
                horasCobranca = horasFormatadas; 
            }

            if (horasCobranca <= 2) {
                valorTotal = horasCobranca * 5.00;
            } else if (horasCobranca <= 4) {
               
                valorTotal = (2 * 5.00) + ((horasCobranca - 2) * 7.50);
            } else {
               
                valorTotal = (2 * 5.00) + (2 * 7.50) + ((horasCobranca - 4) * 10.00);
            }

            System.out.printf("Preço cobrado = R$%.2f\n", valorTotal);
        }
    }
}
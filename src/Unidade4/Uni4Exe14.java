package Unidade4;

import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {

        int dia, mes, ano;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        dia = sc.nextInt();

        System.out.println("Digite o mes: ");
        mes = sc.nextInt();

        System.out.println("Digite o ano: ");
        ano = sc.nextInt();

        //ve se a data faz sentido
        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {

            //meses com 31 dias
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Data valida");

            //meses com 30 dias
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30) {
                    System.out.println("Data valida");
                } else {
                    System.out.println("Data nao valida");
                }

            //mes fevereiro
            } else {
                //ano bissexto
                boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

                if (ehBissexto && dia <= 29) {
                    System.out.println("Data valida");
                } else if (!ehBissexto && dia <= 28) {
                    System.out.println("Data valida");
                } else {
                    System.out.println("Data nao valida");
                }
            }

        } else {
            System.out.println("Data nao valida");
        }
    }
}
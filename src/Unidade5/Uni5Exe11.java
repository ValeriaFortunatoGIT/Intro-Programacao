package Unidade5;

public class Uni5Exe11 {
    public static void main(String[] args) {
        int biscoitosHora = 1;
        int totalDia = 0;

        for (int hora = 1; hora <= 16; hora++) {
            if (hora > 1) {
                biscoitosHora *= 3;
            }
            totalDia += biscoitosHora;
        }

        System.out.println("Total de biscoitos quebrados no dia: " + totalDia);
    }
}
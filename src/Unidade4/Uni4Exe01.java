package Unidade4;

import java.util.Scanner;

public class Uni4Exe01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horaMes;
    float valorPagoHora;
    float salarioTotal;
    float salarioExtra;

    System.out.println("Digite as horas trabalhadas no mes: ");
    horaMes = sc.nextInt();

    System.out.println("Digite o valor pago por hora: ");
    valorPagoHora = sc.nextFloat();
    
    salarioTotal = horaMes * valorPagoHora;

    if( horaMes > 160){
        //tem hora extra
        salarioExtra = (horaMes - 160) * (valorPagoHora / 2);
        salarioTotal = salarioTotal + salarioExtra;
    }
    System.out.println("O salário total é: " + salarioTotal);
}
}

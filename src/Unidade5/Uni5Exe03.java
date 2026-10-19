package Unidade5;

public class Uni5Exe03 {
public static void main(String[] args) {

//Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:

    double total = 0;

    for(double i = 1; i <=100;i++){
        total = total + (1/i);
    }
    System.out.println("Total é: " + total);
}
}

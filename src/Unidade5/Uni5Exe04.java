package Unidade5;

public class Uni5Exe04 {
public static void main(String[] args) {
    
//Descreva um algoritmo para calcular o valor de S dado por:


    float numerador = 3;
    float denominador = 2;
    float total = 0;

    for(int i = 1; i<=20; i++){
        total += (numerador / denominador);
        denominador = ( numerador + denominador +1);
        numerador += 2;
    }
    System.out.println("Total: " + total);
}
}

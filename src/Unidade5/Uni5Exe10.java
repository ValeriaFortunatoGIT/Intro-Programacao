package Unidade5;

public class Uni5Exe10 {
public static void main(String[] args) {

//O número 3025 possui a seguinte característica:
//normalsize&space;30+25=55\rightarrow55^2=3025
//Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:
//normalsize&space;20+25=45\rightarrow45^2=2025

    for(int num1 = 0; num1 <= 10000; num1++){
        for(int num2 = 0; num2 <=10000; num2++){
            //System.out.println(num1 + "-" + num2);

            int soma = (num1 + num2);
            int total = soma * soma;
            //System.out.println(total);

            String termo1 = num1 +""+num2;
            String termo2 = "" + total;

            if(termo1 .equals(termo2)){
            System.out.println(num1 + " + " + num2 + " = " + soma + " -> " + soma + "²" + " = " + total);
            }
        }
    }
}
}

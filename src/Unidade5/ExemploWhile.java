package Unidade5;

import java.util.Scanner;

public class ExemploWhile {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean temSol = false;
    int contador =0;
    while(!temSol){
        System.out.println(contador + " Vitamina D");
        contador++;
        if(contador >=10){
        temSol = true;
        }
    }
}
}

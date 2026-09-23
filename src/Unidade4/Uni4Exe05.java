package Unidade4;

import java.util.Scanner;

public class Uni4Exe05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean num;

    System.out.println("A cor é azul? ");
    num = sc.nextBoolean();

    if(num == true){
        System.out.println("Sim");
    }else{
        System.out.println("Não");
    }
}
}

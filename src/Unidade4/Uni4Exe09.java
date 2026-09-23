package Unidade4;

import java.util.Scanner;

public class Uni4Exe09 {
public static void main(String[] args) {

    int num1;
    int num2;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o primerio numero");
    num1  = sc.nextInt();

    System.out.println("Informe o segundo numero");
    num2  = sc.nextInt();

    if(num1 % num2 == 0){
        System.out.println("São multiplos");
    }else{
        System.out.println("Não são multiplos");
    }
}
}

package Unidade4;

import java.util.Scanner;

public class Uni4Exe03 {
public static void main(String[] args) {
    int num1, num2;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    num1 = sc.nextInt();

    System.out.println("Digite o segundo numero: ");
    num2 = sc.nextInt();
   
    if(num1 > num2){
        System.out.println("O primeiro numero é maior");
    }else{
        System.out.println("O segundo numero é maior");
    }
}
}

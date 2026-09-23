package Unidade4;

import java.util.Scanner;

public class Uni4Exe04 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float num;

    System.out.println("Digite um numero: ");
    num = sc.nextFloat();

    if(num % 1 != 0){
        System.out.println("Casas decimais foram digitadas");
    }else{
        System.out.println("Casas decimais não foram digitadas");
    }
}
}

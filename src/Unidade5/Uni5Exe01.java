package Unidade5;

import java.util.Scanner;

public class Uni5Exe01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<20;i++){
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
}

}
}
}

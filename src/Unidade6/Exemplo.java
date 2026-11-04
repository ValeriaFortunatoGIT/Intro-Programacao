package Unidade6;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        //int[] numero = new int[10];
        //numero[0] = 100;
        //numero[1] = 10;
        //System.out.println(numero[2]);

        int tamanho =5;
        int[] vetor = new int[tamanho];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<tamanho;i++){
            System.out.println("Digite um numero: ");
            int numDigitado = sc.nextInt();
            vetor[i] = numDigitado;
        }
        for(int i = 0;i<vetor.length;i++){
            System.out.print(vetor[i] + ",");
        }
    }
}

package Prova1;

import java.util.Scanner;

public class ProvaAQ1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double peso, distancia, frete;


    System.out.println("Digite o peso da encomenda(em kg): ");
    peso = sc.nextDouble();

    System.out.println("Digite a distancia (em km): ");
    distancia = sc.nextDouble();

    if((peso > 30) || (distancia > 500)){
     frete = 50 + peso * 2;

    }else if(distancia > 1000){
     frete =+ 100;
    } else if( (peso <= 5) && (distancia <= 50)){
    frete = 10;
    }else{
        frete = 20 + peso;
    }
   System.out.println("Valor do frete: R$" + frete);
   System.out.println("Fim");
}
}

package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
public static void main(String[] args) {
    
    double valorCompra = -1;
    double valorPagar;
    double valorTotalDia = 0;

    Scanner sc = new Scanner(System.in);
    while(valorCompra != 0){
         System.out.println("Digite o valor da compra: ");
         valorCompra = sc.nextDouble();
         if(valorCompra == 0){
            break;
         }
         if(valorCompra > 500){
            //desconto de 20%
            double percentual = (20/100.0);
            double desconto = valorCompra * percentual;
            valorPagar = valorCompra - desconto;
         }else{
            //desconto de 15%
            valorPagar = valorCompra - (valorCompra * (15.0/100.0));
         }
         valorTotalDia += valorPagar;
         System.out.println("Valor a pagar: R$ " + valorPagar);
    }
    System.out.printf("O valor total recebido foi de R$2.f" , valorTotalDia);
}
}

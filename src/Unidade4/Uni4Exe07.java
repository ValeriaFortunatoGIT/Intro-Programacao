package Unidade4;

import java.util.Scanner;

public class Uni4Exe07 {
public static void main(String[] args) {
    
    float valorPagar;
    float pesoCarta;
    float qtdAdicional;
    float pesoExcedido;

    valorPagar = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o peso da carta: ");
    pesoCarta = sc.nextFloat();

    if(pesoCarta <=50){
        valorPagar = 0.45f;
        System.out.println(valorPagar);
    }else{
        pesoExcedido = pesoCarta - 50;
        qtdAdicional = (pesoExcedido/20)+1;
        valorPagar = 0.45f + 0.45f * qtdAdicional;
    }
    System.out.println("Custo do selo: " + valorPagar);
}
}

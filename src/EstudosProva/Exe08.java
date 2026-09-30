package EstudosProva;

import java.util.Scanner;

public class Exe08 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

     int codigoPeca1;
     int numeroDePecas1;
     double valorUniPeca1;
     int codigoPeca2;
     int numeroDePecas2;
     double valorUniPeca2;
     double valorTotal;


     System.out.println("Digite o codigo da peça 1: ");
     codigoPeca1 = sc.nextInt();

     System.out.println("Digite o numero de peças 1: ");
     numeroDePecas1 = sc.nextInt();

     System.out.println("Digite o valor unitario de cada peça 1: ");
     valorUniPeca1 = sc.nextDouble();

        System.out.println("Digite o codigo da peça 2: ");
     codigoPeca2 = sc.nextInt();

     System.out.println("Digite o numero de peças 2: ");
     numeroDePecas2 = sc.nextInt();

     System.out.println("Digite o valor unitario de cada peça 2: ");
     valorUniPeca2 = sc.nextDouble();

     valorTotal = numeroDePecas1 * valorUniPeca1 + numeroDePecas2 * valorUniPeca2;

     System.out.println("O total do valor a ser pago é: " + valorTotal);

}
}

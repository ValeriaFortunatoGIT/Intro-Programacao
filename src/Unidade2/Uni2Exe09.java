package Unidade2; 
import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qntddolar, cotacao, valorReal; 

        System.out.println("Digite a quantidade de dólares: ");
        qntddolar = sc.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        cotacao = sc.nextDouble();

        valorReal = qntddolar * cotacao;

        System.out.printf("O atendente deve devolver " + valorReal + " dolares");

    }
}

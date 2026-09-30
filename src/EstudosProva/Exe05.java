package EstudosProva;

import java.util.Scanner;

public class Exe05 {
public static void main(String[] args) {
    
    int A, B, C, D;
    int diferenca;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do produto A: ");
    A = sc.nextInt();

    System.out.println("Digite o valor do produto B: ");
    B = sc.nextInt();

    System.out.println("Digite o valor do produto C: ");
    C = sc.nextInt();

    System.out.println("Digite o valor do produto D: ");
    D = sc.nextInt();

    diferenca =  (A * B - C * D);

    System.out.println("A diferença dos produtos é: " + diferenca);





}
}

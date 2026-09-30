import java.util.Scanner;

public class ExemploScanner {
public static void main(String[] args) {

    int idade;
    Scanner sc = new Scanner(System.in);


    System.out.println("Digite sua idade: ");
    idade = sc.nextInt();

    System.out.println("A idade digitada é: " + idade);
}
}

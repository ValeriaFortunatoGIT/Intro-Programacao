package EstudosProva;

import java.util.Scanner;

public class Exe07 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String nome;
    float salarioFixo;
    int totalVendasDinheiro;
    int comissao;
    float totalFim;

    System.out.println("Digite o nome do funcionario: ");
    nome = sc.next();

    System.out.println("Digite o salario fixo do funcionario: ");
    salarioFixo = sc.nextFloat();

    System.out.println("Digite o total de vendas realizadas pelo funcionario: ");
    totalVendasDinheiro = sc.nextInt();

    totalFim = salarioFixo + (totalVendasDinheiro * 0.15f);          

    System.out.printf("O funcionario %s tem o salario de %.2f e o total a receber no final do mes é: %.2f%n", nome, salarioFixo, totalFim);  } } 



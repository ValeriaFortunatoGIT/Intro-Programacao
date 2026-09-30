package Unidade2; 
 import java.util.Scanner;  
 public class Uni2Exe07 {    public static void main(String[] args)
     {      Scanner sc = new Scanner(System.in);         
        String nome;         
        double salario;         
        double vendas;         
        double total;          
        
        System.out.print("Digite o nome do vendedor: ");      
        nome = sc.nextLine();          
        
        System.out.print("Digite o salario fixo do vendedor: ");         
        salario = sc.nextDouble();          
        System.out.print("Digite o total de vendas feitas pelo vendedor no mes: ");         
        vendas = sc.nextDouble();          
        total = salario + (vendas * 0.15);          
        System.out.printf("O funcionario " + nome +  " que tem o salario de " + salario + " realizou o total de: " + vendas +  " O total a receber no final do mes é: " + total);   } } 
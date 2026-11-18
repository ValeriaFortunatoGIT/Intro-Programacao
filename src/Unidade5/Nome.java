package Unidade5;

import java.util.Scanner;

public class ExemploNome {
public static void main(String[] args) {
    //nome de 5 pessoas e a idade
    // e informar se é maior de idade

    Scanner sc = new Scanner(System.in);

    String nome;
    int idade;

    for(int i = 0; i<= 4; i++ ){
        System.out.println("Digite um nome: ");
        nome = sc.next();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if(idade >= 18){
            System.out.println(nome + "é maior de idade");
        }else{
            System.out.println(nome + " tem " + idade +  " anos e é menor de idade");
        }
    }
}
}
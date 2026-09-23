package Unidade4;

import java.util.Scanner;

public class Uni4Exe06 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    char letra;
    letra = sc.next().toUpperCase().charAt(0);
    //toUpperCase(). serve para converter a letra para maiuscula

    if(letra == 'M'){
   System.out.println("Masculino");
    }else if(letra == 'F'){
        System.out.println("Feminino");
    }else if(letra == 'I'){
        System.out.println("Não informado");
    }else{
        System.out.println("Entrada incorreta");
    }
}
}

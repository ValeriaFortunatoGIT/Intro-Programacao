package Unidade4;

import java.util.Scanner;

public class Uni4Exe08 {
public static void main(String[] args) {
    
    char letra;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe uma letra: ");
    letra = sc.next().toLowerCase().charAt(0);

    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
        System.out.println("É uma vogal");
    }else{
        System.out.println("Não é uma vogal");
    }
}
}

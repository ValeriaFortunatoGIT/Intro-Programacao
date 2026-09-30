package EstudosProva;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

int dia;
Scanner sc = new Scanner(System.in);


System.out.println("Digite um numero de 1 a 5:");
dia = sc.nextInt();

switch (dia){

 case 1:
    System.out.println("Segunda-feira");
   break; 

 case 2:
    System.out.println("Terça-feira");   
break;

 case 3:
    System.out.println("Quarta-feira");   
break;

case 4:
    System.out.println("Quinta-feira");
break;

case 5:
    System.err.println("Sexta-feira");
    break ;   

 default:

}
}
}

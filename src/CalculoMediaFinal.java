import java.util.Scanner;

public class CalculoMediaFinal {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    float prova1;
    float prova2;
    float trabalhoFinal;
    float exercicioUnidade1;
    float exercicioUnidade2;
    float exercicioUnidade3;
    float exercicioUnidade4;
    float exercicioUnidade5;
    float exercicioUnidade6;
    float mediaExercicios;
    float mediaFinal;

    System.out.println("Digite a nota da Prova 1: ");
    prova1 = sc.nextFloat();
    System.out.println("Digite a nota da Prova 2: ");
    prova2 = sc.nextFloat();
    System.out.println("Digite a nota do trabalho final: ");
    trabalhoFinal = sc.nextFloat();

    System.out.println("Digite a nota do exercicio 1: ");
    exercicioUnidade1 = sc.nextFloat();
    System.out.println("Digite a nota do exercicio 2: ");
    exercicioUnidade2 = sc.nextFloat();
    System.out.println("Digite a nota do exercicio 3: ");
    exercicioUnidade3 = sc.nextFloat();
    System.out.println("Digite a nota do exercicio 4: ");
    exercicioUnidade4 = sc.nextFloat();
    System.out.println("Digite a nota do exercicio 5: ");
    exercicioUnidade5 = sc.nextFloat();
    System.out.println("Digite a nota do exercicio 6: ");
    exercicioUnidade6 = sc.nextFloat();

    mediaExercicios = (exercicioUnidade1 + exercicioUnidade2 + exercicioUnidade3 + exercicioUnidade4 + exercicioUnidade5 + exercicioUnidade6) / 6;

    mediaFinal = (prova1 * 0.2f) +(prova2 * 0.3f)+ (trabalhoFinal * 0.3f) + (mediaExercicios * 0.2f);
    System.out.printf("A media final é: %.2f" , mediaFinal);

    if (mediaFinal >=  6){
        System.out.println( "Aprovado(a)");
    }else{
        System.out.println( "Reprovado(a)");
    }

 }
}

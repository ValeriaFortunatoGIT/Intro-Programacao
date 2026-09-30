package EstudosProva;

import java.util.Scanner;

public class Exe06 {
public static void main(String[] args) {
    
    int numFuncionario;
    float horasTrabalhadas, valorHora, salario;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o seu numero de funcionario: ");
    numFuncionario = sc.nextInt();

    System.out.println("Digite suas horas trabalhadas: ");
    horasTrabalhadas = sc.nextFloat();

    System.out.println("Digite quanto voce recebe por hora: ");
    valorHora = sc.nextFloat();

    salario = horasTrabalhadas * valorHora;

    System.out.printf("O funcionario de numero: %d recebe o salario de: %.2f", numFuncionario, salario);
    // %d mostra um número inteiro, %.2f mostra um número decimal com 2 casas

}
}

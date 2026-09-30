package EstudosProva;

import java.util.Scanner;

public class Exe04 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float num1, num2;
    float media;

    System.out.println("Digite a primeira nota: ");
    num1 = sc.nextFloat();

    System.out.println("Digite a segunda nota: ");
    num2 = sc.nextFloat();

    num1 = 3.5f;
    num2 = 7.5f;

    // Multiplica cada nota pelo seu peso e soma os resultados
    media = (num1 * 3.5f + num2 * 7.5f);

    // Divide o resultado pela soma dos pesos para encontrar a média ponderada
    media = media / (3.5f + 7.5f);

    System.out.println("A média ponderada é: " + media);

}
}

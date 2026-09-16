package Unidade4;

import java.util.Scanner;

public class CalcularMediaFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;
        float calcularMedia;
        nota1 = lerNota(sc, 1);
        nota2 = lerNota(sc, 2);
        nota3 = lerNota(sc, 3);
        nota4 = (obterNotaUnidade(sc, 1) +
                obterNotaUnidade(sc, 2) +
                obterNotaUnidade(sc, 3) +
                obterNotaUnidade(sc, 4) +
                obterNotaUnidade(sc, 5) +
                obterNotaUnidade(sc, 6)) / 6;
        media = calcularMedia(nota1, nota2, nota3, nota4);   
        exibirResultado(media);
    }

    private static float lerNota(Scanner sc, int indice) {
        System.out.println("Digite a nota " + indice + " do Aluno:");
        return sc.nextFloat();

    }

    private static float obterNotaUnidade(Scanner sc, int unidade) {
        System.out.println("Digite a nota da Unidade " + unidade);
        return sc.nextFloat();
    }

    private static float calcularMedia(float nota1, float nota2, float nota3, float nota4) {
        return nota1 * 0.2f + nota2 * 0.3f + nota3 * 0.3f + nota4 * 0.2f;
    }

    private static void exibirResultado(float media){
        System.out.println("A média final é: " + media);
        if(media >=6){
            System.out.println(" Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
    
}

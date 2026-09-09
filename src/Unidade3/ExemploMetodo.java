package Unidade3;

import java.util.Scanner;

public class ExemploMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        int num1 = lerNumero(sc);
        int num2 = lerNumero(sc);
        System.out.println("---SOMA---");
        // somar os valores usando metodo
        int resultado = somaDoisNum(num1, num2);
        imprimirResultado(resultado);

        System.out.println("---SUBTRAÇÃO---");
        resultado = subtracaoDoisNum(num1, num2);
        imprimirResultado(resultado);

        System.out.println("---MULTIPLICAÇÃO---");
        resultado = multiplicar(num1, num2);
        imprimirResultado(resultado);

        System.out.println("---DIVISÃO---");
        resultado = dividir(num1, num2);
        imprimirResultado(resultado);

    }

    // metodos
    // escopo - tipo - nome - parametros
    public void somar() {
        // metodo void não retorna
    }

    public int somaNum() {
        // metodo int obrigatorio retonar
        return 1;
    }

    public static int somaDoisNum(int a, int b) {
        return a + b;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static int subtracaoDoisNum(int a, int b) {
        return a - b;
    }

    public static int lerNumero(Scanner sc) {
        System.out.println("Digite um número: ");
        return sc.nextInt();
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}

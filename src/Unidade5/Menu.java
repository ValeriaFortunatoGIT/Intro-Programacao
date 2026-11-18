package Unidade5;

import java.util.Scanner;

public class ExemploMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println(" :: MENU :: \n " + " Digite a opção desejada \n"
                    + "1 - Fale sobre pagamentos \n"
                    + "2 - Fale sobre problema  de conexão \n"
                    + "3 - Fale sobre o 4G \n"
                    + "4 - Fale com um atendente \n"
                    + "5 - Repetir \n"
                    + "9 - Falar com um humano \n"
                    + "0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu sobre xxxxxxx");
                    System.out.println("\033[H");
                    break;
                case 2:
                    System.out.println("Voce escolheu sobre xxxxxxx");
                    break;

                case 3:
                    System.out.println("Voce escolheu sobre xxxxxxx");
                    break;

                case 4:
                    System.out.println("Voce escolheu falar com atendente");
                    break;

                case 5:
                    System.out.println("Vamos repetir o menu, preste atenção");
                    break;

                case 9:
                    System.out.println("Um atendente logo ira te atender");
                    break;

                case 0:
                    System.out.println("Obrigado até logo");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }

        } while (opcao != 0);
    }
}

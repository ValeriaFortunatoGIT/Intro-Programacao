package  Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        int filho1, filho2, filho3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro filho:");
        filho1 = sc.nextInt();

        System.out.println("Digite a idade do segundo filho:");
        filho2 = sc.nextInt();

        System.out.println("Digite a idade do terceiro filho:");
        filho3 = sc.nextInt();

        if (filho1 == filho2 && filho2 == filho3) {

            System.out.println("TRIGEMEOS");

        } else if (filho1 == filho2 || filho1 == filho3 || filho2 == filho3) {

            System.out.println("GEMEOS");

        } else {
            System.out.println("APENAS IRMAOS");
        }

        sc.close();
    }
}
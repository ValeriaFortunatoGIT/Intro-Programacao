package Unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.xml.sax.SAXException;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000000000");
        double massaInicial = 0;
        System.out.println("Informe a massa inicial em Kg: ");
        massaInicial = sc.nextDouble();
        double massa = massaInicial * 1000; // kilos para gramas
        double tempo = 0;
        while (massa > 0.5) {
            massa /= 2; // massa = massa / 2
            tempo += 50; // massa = massa + 50
        }
        System.out.println(" massa inicial (Kg): " + massaInicial);
        System.out.println(" massa final (Kg): " + df.format((massa / 1000)));
        System.out.println(" tempo (segundos): " + tempo);
    }
}

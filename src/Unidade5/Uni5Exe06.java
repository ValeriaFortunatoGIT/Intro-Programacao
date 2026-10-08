public class Uni5Exe06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 0, altura;

        for (int i = 0; i < 20; i++) {
            System.out.println("Altura da pessoa " + (i + 1) + ": ");
            altura = sc.nextDouble();
            media += altura;
        }

        System.out.println("A média das alturas é: " + (media / 20));

    }
}
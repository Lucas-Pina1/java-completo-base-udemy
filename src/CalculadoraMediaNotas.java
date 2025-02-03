import java.util.Scanner;

public class CalculadoraMediaNotas {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite sua primeiro nota:");
        double primeiraNota = leitorTeclado.nextFloat();

        System.out.println("Digite sua segunda nota:");
        double segundaNota = leitorTeclado.nextFloat();

        System.out.println("Digite sua terceira nota:");
        double terceiraNota = leitorTeclado.nextFloat();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("Sua media final foi de: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        leitorTeclado.close();
    }
}

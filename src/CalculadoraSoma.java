import java.util.Scanner;

public class CalculadoraSoma {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int primeiroNumero = leitorTeclado.nextInt();

        System.out.println("Digite outro numero inteiro:");
        int segundoNumero = leitorTeclado.nextInt();

        int soma = primeiroNumero + segundoNumero;

        System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " é: " + soma);

        leitorTeclado.close();
    }
}

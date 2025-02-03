import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsisus que quer converter:");
        double temperaturaCelsisus = leitorTeclado.nextDouble();

        double fahrenheit = (temperaturaCelsisus * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        leitorTeclado.close();
    }
}

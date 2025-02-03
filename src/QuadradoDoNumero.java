import java.util.Scanner;

public class QuadradoDoNumero {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o numero que deseja saber o seu qquadrado:");
        double numero = leitorTeclado.nextDouble();

        double quadrado = numero * numero;

        System.out.println("O quadrado do numero " + numero + " é: " + quadrado);

        leitorTeclado.close();

    }
}

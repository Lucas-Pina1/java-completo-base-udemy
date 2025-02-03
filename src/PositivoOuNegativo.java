import java.util.Scanner;

public class PositivoOuNegativo {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = leitorTeclado.nextInt();

        if (numero > 0) {
            System.out.println("Numero é positivo");
        } else if (numero < 0) {
            System.out.println("Numero é negativo");
        } else {
            System.out.println("Numero é zero");
        }

        leitorTeclado.close();
    }
}

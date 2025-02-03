import java.util.Scanner;

public class LoopComWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor:");
        int contador = scanner.nextInt();
        int valor = 1;

        System.out.println("Os valores que são par na contagem de " + valor + " Até " + contador + " são:");

        while (valor <= contador) {

            boolean verificarSeEPar = valor % 2 == 0;

            if (verificarSeEPar) {
                System.out.println(valor);
            }
            valor++;
        }

        valor = 1;

        System.out.println("\nOs valores que são impar na contagem de " + valor + " Até " + contador + " são:");

        while (valor <= contador) {
            boolean verificarSeEImpar = valor % 2 == 1;

            if (verificarSeEImpar) {
                System.out.println(valor);
            }
            valor++;
        }
        scanner.close();
    }
}

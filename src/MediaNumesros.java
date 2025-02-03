import java.util.Scanner;

public class MediaNumesros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número:");
            numeros[i] = scanner.nextInt();
        }

        double somaElementos = 0;

        for (int numero : numeros) {
            somaElementos += numero;
        }

        double media = somaElementos / numeros.length;

        System.out.println("A médias dos números é: " + media);

        scanner.close();
    }
}

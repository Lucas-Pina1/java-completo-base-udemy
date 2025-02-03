import java.util.Scanner;

public class ArrayInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do array: ");
        int quantidadeDeElementos = scanner.nextInt();

        int numeros[] = new int[quantidadeDeElementos];

        System.out.println("Agora prencha o array:");
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Digite o " + (i+1) + " número:");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("O array final é:");
        for(int numero : numeros) {
            System.out.println(numero + " ");
        }
        scanner.close();
    }
}

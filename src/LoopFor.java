import java.util.Scanner;

public class LoopFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int valor = scanner.nextInt();

        for (int contador = 0; contador <= valor; contador++) {
            System.out.println(contador);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ContadorNumerosPares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        System.out.println("OS numeros pares são:");
        for (int i = 1; i <= numero ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digete um número e descubra se é par ou impar:");
        int number = scanner.nextInt();

        String isParOrImpar = (number % 2 == 0) ? "Par" : "Impar";

        System.out.println("O número " + number + " é " + isParOrImpar);
        scanner.close();
    }
}

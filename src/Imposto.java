import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário para saber o imposto:");
        double salario = scanner.nextDouble();


        double valorImposto = (salario - 2000) * 0.15;

        boolean isImposto = salario > 2000;
        if (isImposto) {
            System.out.println("O valor a pagar de imposto é de: R$ " + valorImposto);
        } else {
            System.out.println("Você está isento de pagar imposto");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Triagulo {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo:");
        int primeiroLado = leitorTeclado.nextInt();

        System.out.println("Digite o segundo lado do triangulo:");
        int segundoLado = leitorTeclado.nextInt();

        System.out.println("Digite o terceiro lado do triangulo:");
        int terceiroLado = leitorTeclado.nextInt();

        if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
            System.out.println("Triângulo Equilátero: possui os 3 lados iguais.");
        } else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
            System.out.println("Triângulo Isósceles: possui os 2 lados iguais.");
        } else {
            System.out.println("Triângulo Escaleno: possui os 3 lados diferentes.");
        }
        leitorTeclado.close();
    }
}

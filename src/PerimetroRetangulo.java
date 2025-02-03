import java.util.Scanner;

public class PerimetroRetangulo {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite a base do retangulo:");
        double base = leitorTeclado.nextDouble();

        System.out.println("Digite a altura do retangulo:");
        double altura = leitorTeclado.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("O perimetro do retangulo é : " + perimetro);
        System.out.println("O area do retangulo é : " + area);
        
        leitorTeclado.close();
    }
}

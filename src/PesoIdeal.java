import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double altura = leitorTeclado.nextDouble();

        System.out.println("Qual seu sexo? Digite 1 - Masculino ou 2 - Feminino");
        int sexo = leitorTeclado.nextInt();

        double pesoIdeal;

        if (sexo == 1) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 2) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido");
            return;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal + "Kg");

        leitorTeclado.close();
    }
}

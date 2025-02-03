import java.util.Scanner;

public class PodeVotar {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = leitorTeclado.nextInt();

        System.out.println("Digite o ano que estamos:");
        int anoAtual = leitorTeclado.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
        leitorTeclado.close();
    }
}

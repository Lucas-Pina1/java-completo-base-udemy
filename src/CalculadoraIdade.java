import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        int anoAtual = leitorTeclado.nextInt();

        System.out.println("Digite o ano do seu nascimento:");
        int anoNascimento = leitorTeclado.nextInt();

        int resultado = anoAtual - anoNascimento;

        System.out.println("A idade é : " + resultado);

        if (resultado < 18) {
            System.out.println("Você é menor de idade");
        } else if (resultado < 60) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é idoso");
        }

        leitorTeclado.close();
    }
}

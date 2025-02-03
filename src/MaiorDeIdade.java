import java.util.Scanner;

public class MaiorDeIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem);
        scanner.close();
    }
}

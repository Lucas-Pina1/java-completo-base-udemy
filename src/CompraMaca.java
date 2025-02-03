import java.util.Scanner;

public class CompraMaca {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Quantas maçãs você quer comprar?");
        int quantidadeMacas = leitorTeclado.nextInt();

        double preco = 0.30;
        double total = quantidadeMacas * preco;

        if (quantidadeMacas >= 12) {
            preco = 0.25;
        }

        System.out.println("Você comprou " + quantidadeMacas + " maçãs, preço da unidade - R$ " + preco + " e total da compra deu: R$ " + total);

        leitorTeclado.close();
    }
}

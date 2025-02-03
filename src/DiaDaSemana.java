import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 - 7 e descubra o dia da semana:");
        int day = scanner.nextInt();
        String mensagem = "";

        switch (day) {
            case 1:
                mensagem = "Domingo";
                break;
            case 2:
                mensagem = "Segunda";
                break;
            case 3:
                mensagem = "Terça";
                break;
            case 4:
                mensagem = "Quarta";
                break;
            case 5:
                mensagem = "Quinta";
                break;
            case 6:
                mensagem = "Sexta";
                break;
            case 7:
                mensagem = "Sábado";
                break;
            default:
                mensagem = "Número inválido";
                break;
        }
        mensagem = day <= 7 && day > 0  ?  "O dia da semana é: " + mensagem : mensagem;
        System.out.println(mensagem);
        scanner.close();
    }
}

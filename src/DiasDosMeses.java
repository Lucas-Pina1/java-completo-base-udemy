import java.util.Scanner;

public class DiasDosMeses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 - 12 e descubra a quantidade de dias do mês:");
        int mes = scanner.nextInt();

        String nomeMes = "";
        int dias = 0;
        String mensagem = "";

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                dias = 31;
                break;
            case 2:
                nomeMes = "Fevereiro";
                dias = 28;
                break;
            case 3:
                nomeMes = "Março";
                dias = 31;
                break;
            case 4:
                nomeMes = "Abril";
                dias = 30;
                break;
            case 5:
                nomeMes = "Maio";
                dias = 31;
                break;
            case 6:
                nomeMes = "Junho";
                dias = 30;
                break;
            case 7:
                nomeMes = "Julho";
                dias = 31;
                break;
            case 8:
                nomeMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nomeMes = "Setembro";
                dias = 30;
                break;
            case 10:
                nomeMes = "Outubro";
                dias = 31;
                break;
            case 11:
                nomeMes = "Novembro";
                dias = 30;
                break;
            case 12:
                nomeMes = "Dezembro";
                dias = 31;
                break;
            default:
                mensagem = "Número inválido";
                break;
        }
        mensagem = mes <= 12 && mes > 0 ?  "O mês de " + nomeMes + " tem " + dias + " dias." : mensagem;
        System.out.println(mensagem);
        scanner.close();
    }

}

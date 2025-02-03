import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int year = scanner.nextInt();

        int Sumlast2Numbers = 0;
        for (int i = 1; i <= 2 ; i++) {
            Sumlast2Numbers += year % 10;
        }

        if (year % 4 == 0 && Sumlast2Numbers != 0 || Sumlast2Numbers == 0 && year % 400 == 0) {
            System.out.println(year + " é Bissexto");
        } else {
            System.out.println(year + " não é Bissexto");
        }
        scanner.close();
    }
}

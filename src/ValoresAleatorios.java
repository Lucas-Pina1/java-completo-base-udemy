import java.util.Random;

public class ValoresAleatorios {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }

        for(int numero : numeros) {
            if(numero > 25) {
                soma += numero;
                contador++;
            }
        }
        double media = soma / contador;

        if (contador > 0) {
            System.out.println("A média dos numeros maiores que 25 são: " + media);
        } else {
            System.out.println("Não há numeros maiores que 25");
        }
    }
}

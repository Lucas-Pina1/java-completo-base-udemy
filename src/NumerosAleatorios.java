import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        int indicePrimeiroPar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                indicePrimeiroPar = i;
                break;
            }
        }

        if (indicePrimeiroPar != -1) {
            System.out.println("O indice que tem o primeiro par é: " + indicePrimeiroPar);
        } else {
            System.out.println("Não há elemento par no array");
        }
    }
}

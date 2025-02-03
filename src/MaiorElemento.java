public class MaiorElemento {

    public static void main(String[] args) {

        double[] numeros = {10.5,20.7,15.3,40.2,8.9};

        double maiorNumero = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("Maior número: " + maiorNumero);
    }
}

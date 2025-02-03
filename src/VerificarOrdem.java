public class VerificarOrdem {

    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9};

        boolean ordenado = true;
//        int numero = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }
        if (ordenado) {
            System.out.println("Ordenado de forma crescente");
        } else {
            System.out.println("Não está ordenado de forma crescente");
        }
    }
}

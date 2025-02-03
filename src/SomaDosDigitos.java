public class SomaDosDigitos {

    public static void main(String[] args) {
        int soma = 0;
        for (int numero = 12345; numero != 0;) {
            soma += numero % 10;
            numero /= 10; // numero = numero / 10;
        }
        System.out.println("A soma dos digitos é: " + soma);
    }
}

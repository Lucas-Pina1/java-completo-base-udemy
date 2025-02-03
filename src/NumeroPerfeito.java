public class NumeroPerfeito {

    public static void main(String[] args) {

        int number = 28;
        int sum = 0;

        for (int i = 1; i < number ; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " é um número perfeito");
        } else {
            System.out.println(number + " não é um número perfeito");
        }
    }
}

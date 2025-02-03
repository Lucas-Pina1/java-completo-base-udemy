public class NumerosPrimos1a50 {

    public static void main(String[] args) {
        for (int number = 2; number <= 50; number++) {
            boolean isPrimo = true;
            for (int j = 2; j < number ; j++) {
                if (number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(number + ": é primo");
            }
        }
    }
}


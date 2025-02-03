public class SomaArrays {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] soma = new int[array1.length];

        for (int i = 0; i < array1.length ; i++) {
            soma[i] = array1[i] + array2[i];
        }

        for (int valor : soma) {
            System.out.println(valor + " ");
        }
    }
}

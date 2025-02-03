public class NomesOrdemReversa {

    public static void main(String[] args) {
        String[] nomes = {"Lucas","Pedro","Douglas","Camila","Mia","Maltilda"};

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}

public class OperadorTernario {

    public static void main(String[] args) {

        int idade = 20;
        int idadeMinima = 18;
        int anoNascimento = 2000;

        String deMaior = idade >= 18 ? "Sim, é de maior" : "Não, é de menor";
        System.out.println(deMaior);
    }
}

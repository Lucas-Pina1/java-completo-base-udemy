import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kilos):");
        float peso = leitorTeclado.nextFloat();

        System.out.println("Agora, digite sua altura (em centimetros)");
        float altura = leitorTeclado.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Com seu peso de " + peso + " e sua altura de " + altura + " seu IMC é de : " + imc);

        leitorTeclado.close();
    }
}

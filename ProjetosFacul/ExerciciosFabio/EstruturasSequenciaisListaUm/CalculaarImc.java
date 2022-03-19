package ListaUm;
import java.util.Scanner;

public class CalculaarImc {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		float imc, altura,peso; 
	    System.out.println("Programa pra calcular IMC!");
	    System.out.print("Informe o peso: ");
	    peso = leitorDoTeclado.nextFloat();
        System.out.print("Informe a altura: ");
	    altura = leitorDoTeclado.nextFloat();
        imc=peso/(altura*altura);
        System.out.println("IMC: "+imc);
	}
}

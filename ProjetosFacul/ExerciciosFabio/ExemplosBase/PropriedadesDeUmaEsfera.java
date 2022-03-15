package ExemplosBase;
import java.util.Scanner;

public class PropriedadesDeUmaEsfera {
	public static void main(String[] args) {
		Scanner leitorDoTeclado = new Scanner(System.in);
		double raioDaEsfera , areaDaEsfera , volumeDaEsfera ;
		System.out.println("******* Programa que calcula as propriedades de uma esfera! *******");
		System.out.print("Entre com o raio da esfera: ");
		raioDaEsfera = leitorDoTeclado.nextDouble();
		areaDaEsfera = 4 * 3.1415 * raioDaEsfera * raioDaEsfera;
		volumeDaEsfera = 4 * 3.1415 * (raioDaEsfera * raioDaEsfera * raioDaEsfera) / 3;
		System.out.println("Área da esfera: " + areaDaEsfera + "    Volume da esfera: " + volumeDaEsfera);
	}
}

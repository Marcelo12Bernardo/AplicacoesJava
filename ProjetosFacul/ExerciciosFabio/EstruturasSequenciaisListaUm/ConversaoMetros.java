package ListaUm;
import java.util.Scanner;

public class ConversaoMetros {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		float medidaMet, medidaCen; // Declaração de variáveis

	    System.out.println("Programa Conversao de Metros!");
	    System.out.print("Informe a medida em Metros: ");

	    medidaMet = leitorDoTeclado.nextFloat();
        medidaCen=medidaMet*100;

        System.out.println(medidaMet+"m equivale a: "+medidaCen+"cm");
	}
}
package ListaUm;
import java.util.Scanner;

public class CalcularAntecessorSucessor {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero,antecessor, sucessor; // Declaração de variáveis

	    System.out.println("Programa Calcular o antecessor e o sucessor!");
	    System.out.print("Informe o numero: ");
	    numero = leitorDoTeclado.nextInt();
        antecessor=numero-1;
        sucessor=numero+1;

        System.out.println("Numero: "+numero);
        System.out.println("Antecessor: "+antecessor);
        System.out.println("Sucessor: "+sucessor);
	}
}

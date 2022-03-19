package ListaUm;
import java.util.Scanner;

public class CalcularDeslocamento {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int espacoInicial, velocidade, tempo, deslocamento; // Declaração de variáveis

	    System.out.println("Programa para Calcular a posicao de um movel!");
	    System.out.print("Informe o espaco inicial: ");
        espacoInicial = leitorDoTeclado.nextInt();
        System.out.print("Informe o tempo: ");
        tempo = leitorDoTeclado.nextInt();
        System.out.print("Informe a velocidade: ");
        velocidade = leitorDoTeclado.nextInt();
	   
	    deslocamento=espacoInicial+(velocidade*tempo);
        System.out.println("S=S0+V*T");
	    System.out.println("S="+espacoInicial+"+"+velocidade+"*"+tempo);
        System.out.println("S="+deslocamento);
	}
}

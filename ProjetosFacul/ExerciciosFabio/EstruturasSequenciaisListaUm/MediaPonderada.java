package ListaUm;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
		Scanner leitorDoTeclado = new Scanner(System.in);
		float notaP1, notaP2,notaP3, mediaPonderada; 
	    System.out.println("Programa Média Ponderada!");
	    System.out.print("Informe a nota da P1: ");
	    notaP1 = leitorDoTeclado.nextFloat();
        System.out.print("Informe a nota da P2: ");
	    notaP2 = leitorDoTeclado.nextFloat();
        System.out.print("Informe a nota da P3: ");
	    notaP3 = leitorDoTeclado.nextFloat();
	    mediaPonderada = ((notaP1*1)+(notaP2*2)+(notaP3*3))/6;
	    System.out.println("Média Ponderada: " + mediaPonderada);
	}
}

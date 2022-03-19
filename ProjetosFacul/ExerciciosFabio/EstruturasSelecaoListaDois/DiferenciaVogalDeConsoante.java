//Faca um programa que verifique se uma letra digitada e vogal ou consoante.
import java.util.Scanner;

public class DiferenciaVogalDeConsoante {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		String letra; 

	    System.out.println("Programa para diferenciar vogais e consoantes!");
	    System.out.print("Informe uma letra: ");
	    letra = leitorDoTeclado.nextLine();

        if((letra.equalsIgnoreCase("a"))||(letra.equalsIgnoreCase("e"))||(letra.equalsIgnoreCase("i"))||(letra.equalsIgnoreCase("o"))||(letra.equalsIgnoreCase("u"))){ System.out.println(letra+" - e uma vogal!");}
        else System.out.println(letra+" - e uma consoante!");
        
	}
}

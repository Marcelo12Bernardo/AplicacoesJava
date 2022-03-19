//  Escreva um programa que receba um numero e imprima se o numero e ou nao e multiplo de 3
// e PAR ou IMPAR.
import java.util.Scanner;
public class VerificaMultiplosTres {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero; 

	    System.out.println("Programa para verificar se o numero multiplo de 3!");
	    System.out.print("Informe o numero: ");
	    numero = leitorDoTeclado.nextInt();

        if((numero%3)==0){ System.out.println(numero+" e um multiplo de 3");}
        else System.out.println(numero+" nao e um multiplo de 3");
        
	}
}

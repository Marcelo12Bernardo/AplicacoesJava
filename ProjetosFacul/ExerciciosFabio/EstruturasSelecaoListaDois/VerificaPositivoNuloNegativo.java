//Faca um programa que peca um valor e mostre na tela se o valor 
//e positivo, negativo ou nulo.
import java.util.Scanner;

public class VerificaPositivoNuloNegativo {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero; 

	    System.out.println("Programa para verificar se o valor é positivo, negativo ou nulo!");
	    System.out.print("Informe o numero: ");
	    numero = leitorDoTeclado.nextInt();

        if(numero<0){ System.out.println("O valor "+numero+" e negativo!");}
        else if(numero>0){System.out.println("O valor "+numero+" e positivo!");}
        else System.out.println("O valor "+numero+" e nulo!");
        
	}
}

// Construa um programa que determine se um dado numero N inteiro (recebido atraves do teclado)
// e PAR ou IMPAR.
import java.util.Scanner;
public class VerificaParOuImpar {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero; 

	    System.out.println("Programa para verificar se e Par ou Impar!");
	    System.out.print("Informe um numero: ");
	    numero = leitorDoTeclado.nextInt();

        if((numero%2)==0){ System.out.println(numero+" e PAR!");}
        else System.out.println(numero+" e IMPAR!");
        
	}
}

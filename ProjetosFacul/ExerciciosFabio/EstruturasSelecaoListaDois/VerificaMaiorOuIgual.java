//Prepare um programa para perguntar dois numeros e informar qual deles e o
//maior ou se os numeros sao iguais
import java.util.Scanner;

public class VerificaMaiorOuIgual {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int valorUm,valorDois; 

	    System.out.println("Programa para verificar se um numero é maior ou se são iguais!");
	    System.out.print("Informe o primeiro numero: ");
	    valorUm = leitorDoTeclado.nextInt();
        System.out.print("Informe o segundo numero: ");
	    valorDois = leitorDoTeclado.nextInt();

        if(valorUm>valorDois){ System.out.println(valorUm+" maior que "+valorDois);}
        else if(valorDois>valorUm){System.out.println(valorDois+" maior que "+valorUm);}
        else System.out.println("O valores são iguais!");
        
	}
}
